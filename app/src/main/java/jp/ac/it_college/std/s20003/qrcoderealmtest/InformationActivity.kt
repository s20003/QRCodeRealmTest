package jp.ac.it_college.std.s20003.qrcoderealmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.ac.it_college.std.s20003.qrcoderealmtest.databinding.ActivityInformationBinding

class InformationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // binding.dataList
    }
}