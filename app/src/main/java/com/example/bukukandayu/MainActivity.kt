package com.example.bukukandayu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tokan: Button
    private lateinit var total: Button
    private lateinit var devteam: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tokan = findViewById(R.id.tokan)
        tokan.setOnClickListener(this)
        total = findViewById(R.id.total)
        total.setOnClickListener(this)
        devteam = findViewById(R.id.dev1)
        devteam.setOnClickListener (this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tokan -> {
                val intent = Intent(this, Kanmen::class.java)
                startActivity(intent)
            }
            R.id.total -> {
                val intent = Intent(this, Total::class.java)
                startActivity(intent)
            }
            R.id.dev1 -> {
                val intent = Intent(this, Devteamact::class.java)
                startActivity(intent)
            }
        }
    }

}