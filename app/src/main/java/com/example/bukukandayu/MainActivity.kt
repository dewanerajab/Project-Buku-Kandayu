package com.example.bukukandayu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tokan: Button
    private lateinit var total: Button
    private lateinit var dev1: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tokan = findViewById(R.id.tokan)
        tokan.setOnClickListener(this)
        total = findViewById(R.id.total)
        total.setOnClickListener(this)
        dev1 = findViewById(R.id.dev1)
        dev1.setOnClickListener (this)
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
            R.id.dev1-> {
                val intent = Intent(this, Devteamact::class.java)
                startActivity(intent)
            }
        }
    }


}