package com.example.bukukandayu

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import android.content.Intent

class Kanmen : AppCompatActivity(), View.OnClickListener {

    private lateinit var tombol1: Button
    private lateinit var tombol2: Button
    private lateinit var tombol3: Button
    private lateinit var tombol4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kanmen)

        tombol1 = findViewById(R.id.tombol1)
        tombol2 = findViewById(R.id.tombol2)
        tombol3 = findViewById(R.id.tombol3)
        tombol4 = findViewById(R.id.tombol4)

        tombol1.setOnClickListener(this)
        tombol2.setOnClickListener(this)
        tombol3.setOnClickListener(this)
        tombol4.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tombol1 -> {
                val intent = Intent(this, Kandayu1::class.java)
                startActivity(intent)
            }
            R.id.tombol2 -> {
                val intent = Intent(this, Kandayu2::class.java)
                startActivity(intent)
            }
            R.id.tombol3 -> {
                val intent = Intent(this, Kandayu3::class.java)
                startActivity(intent)
            }
            R.id.tombol4 -> {
                val intent = Intent(this, Kandayu4::class.java)
                startActivity(intent)
            }
        }
    }
}
