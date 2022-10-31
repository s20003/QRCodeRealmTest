@file:Suppress("DEPRECATION")

package jp.ac.it_college.std.s20003.qrcoderealmtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.ac.it_college.std.s20003.qrcoderealmtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.infoButton.setOnClickListener {
            val intent = Intent(applicationContext, InformationActivity::class.java)
            startActivity(intent)
        }

        binding.qrButton.setOnClickListener {
            val intent = Intent(applicationContext, DataRegisterActivity::class.java)
            startActivity(intent)
        }
    }

}