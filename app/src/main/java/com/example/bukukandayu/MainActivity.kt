package com.example.bukukandayu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombol1: Button = findViewById(R.id.tombol1)
        tombol1.setOnClickListener {
            val intent = Intent(this, Kandayu::class.java)
            startActivity(intent)
        }
        val tombol2: Button = findViewById(R.id.tombol2)
        tombol2.setOnClickListener {
            val intent = Intent(this, Kandayu2::class.java)
            startActivity(intent)
        }
        val tombol3: Button = findViewById(R.id.tombol3)
        tombol3.setOnClickListener {
            val intent = Intent(this, Kandayu3::class.java)
            startActivity(intent)
        }
        val tombol4: Button = findViewById(R.id.tombol4)
        tombol4.setOnClickListener {
            val intent = Intent(this, Kandayu4::class.java)
            startActivity(intent)
        }
    }
}