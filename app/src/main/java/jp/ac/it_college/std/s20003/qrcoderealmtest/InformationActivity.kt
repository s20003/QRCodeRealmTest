package jp.ac.it_college.std.s20003.qrcoderealmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import io.realm.kotlin.ext.query
import io.realm.kotlin.query.RealmResults
import jp.ac.it_college.std.s20003.qrcoderealmtest.databinding.ActivityInformationBinding

class InformationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInformationBinding

    val config = RealmConfiguration.Builder(schema = setOf(Data::class))
        .build()
    val realm: Realm = Realm.open(config)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result: RealmResults<Data> = realm.query<Data>().find()

        binding.dataList.apply {
            layoutManager = LinearLayoutManager(this@InformationActivity).apply {
                orientation = LinearLayoutManager.VERTICAL
            }
            adapter = DataListAdapter(result)
        }
    }
}