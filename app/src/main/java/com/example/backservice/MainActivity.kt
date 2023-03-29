package com.example.backservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.backservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.start.setOnClickListener {
            startService(Intent(this,service::class.java))
        }
        binding.stop.setOnClickListener {
            stopService(Intent(this,service::class.java))
        }

    }
}