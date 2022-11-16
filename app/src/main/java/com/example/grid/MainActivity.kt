package com.example.grid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_kontrol.setOnClickListener{
             val intent = Intent(this, KontrolActivity::class.java)
            startActivity(intent)
        }

        card_Monitoring.setOnClickListener{
            val intent = Intent(this, MonitoringActivity::class.java)
            startActivity(intent)
        }
    }
}