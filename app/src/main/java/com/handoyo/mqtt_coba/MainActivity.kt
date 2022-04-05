package com.handoyo.mqtt_coba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.handoyo.mqtt_coba.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switch1.setOnClickListener {

        }





    }



}