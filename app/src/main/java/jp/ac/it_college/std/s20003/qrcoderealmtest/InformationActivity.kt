package jp.ac.it_college.std.s20003.qrcoderealmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm
import jp.ac.it_college.std.s20003.qrcoderealmtest.databinding.ActivityInformationBinding

class InformationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInformationBinding
    private lateinit var realm: Realm
    private lateinit var adapter: DataListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        realm = Realm.getDefaultInstance()

        val recyclerView = binding.dataList
        recyclerView.adapter = adapter

        /*
        realm.addChangeListener {
            val dataList = it.where(Data::class.java).findAll().map { data -> data.name }
            recyclerView.post {
                adapter.updateDataList(dataList)
            }
        }

        realm.executeTransactionAsync {
            val dataList = it.where(Data::class.java).findAll().map { data -> data.name }
            recyclerView.post {
                adapter.updateDataList(dataList)
            }
        }

         */
    }
}