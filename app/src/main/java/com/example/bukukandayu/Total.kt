package com.example.bukukandayu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Total : AppCompatActivity(), View.OnClickListener {
    private lateinit var buttonTalatah: Button
    private lateinit var buttonDoaTamparan: Button
    private lateinit var buttonDoaKahapus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.total)

        buttonTalatah = findViewById(R.id.tomboltalsun)
        buttonTalatah.setOnClickListener(this)

        buttonDoaTamparan = findViewById(R.id.tomdotam)
        buttonDoaTamparan.setOnClickListener(this)

        buttonDoaKahapus = findViewById(R.id.tomkabas)
        buttonDoaKahapus.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tomboltalsun -> {
                val intent = Intent(this, Talatahdansusunan::class.java)
                startActivity(intent)
            }
            R.id.tomdotam -> {
                val intent = Intent(this, Doatamparan::class.java)
                startActivity(intent)
            }
            R.id.tomkabas -> {
                val intent = Intent(this, Doakahapus::class.java)
                startActivity(intent)
            }
        }
    }
}