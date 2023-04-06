package com.example.bukukandayu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Kanmen : AppCompatActivity(), View.OnClickListener {

    private lateinit var tombol1: Button
    private lateinit var tombol2: Button
    private lateinit var tombol3: Button
    private lateinit var tombol4: Button
    private lateinit var tombolkanyunyelutaheta: Button
    private lateinit var tombolkatikanahunan: Button
    private lateinit var tombolkandayuanaksakula: Button
    private lateinit var tombolkandayuuluhhaban: Button
    private lateinit var kandayuakanpanganten: Button
    private lateinit var tombolkandayuakanhajat: Button
    private lateinit var tombolkantuakanuluhmatei: Button
    private lateinit var tombolkanyumetngubur: Button
    private lateinit var tombolkanyulimngubur: Button
    private lateinit var tombolpampetehtuhan: Button
    private lateinit var tombolkanyuusaha: Button
    private lateinit var tombolkanyupendenghuma: Button
    private lateinit var tombolkanyubulihumanew: Button
    private lateinit var tomboltombolkanyuparendeng: Button
    private lateinit var tombolkanyumambina: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kanmen)

        tombol1 = findViewById(R.id.tombol1)
        tombol2 = findViewById(R.id.tombol2)
        tombol3 = findViewById(R.id.tombol3)
        tombol4 = findViewById(R.id.tombol4)
        tombolkanyunyelutaheta = findViewById(R.id.tombolkanyunyelutaheta)
        tombolkatikanahunan = findViewById(R.id.tombolkatikanahunan)
        tombolkandayuanaksakula = findViewById(R.id.tombolkandayuanaksakula)
        tombolkandayuuluhhaban = findViewById(R.id.tombolkandayuuluhhaban)
        kandayuakanpanganten = findViewById(R.id.kandayuakanpanganten)
        tombolkandayuakanhajat = findViewById(R.id.tombolkandayuakanhajat)
        tombolkantuakanuluhmatei = findViewById(R.id.tombolkantuakanuluhmatei)
        tombolkanyumetngubur = findViewById(R.id.tombolkanyumetngubur)
        tombolkanyulimngubur = findViewById(R.id.tombolkanyulimngubur)
        tombolpampetehtuhan = findViewById(R.id.tombolpampetehtuhan)
        tombolkanyuusaha = findViewById(R.id.tombolkanyuusaha)
        tombolkanyupendenghuma = findViewById(R.id.tombolkanyupendenghuma)
        tombolkanyubulihumanew = findViewById(R.id.tombolkanyubulihumanew)
        tomboltombolkanyuparendeng = findViewById(R.id.tomboltombolkanyuparendeng)
        tombolkanyumambina = findViewById(R.id.tombolkanyumambina)


        tombol1.setOnClickListener(this)
        tombol2.setOnClickListener(this)
        tombol3.setOnClickListener(this)
        tombol4.setOnClickListener(this)
        tombolkanyunyelutaheta.setOnClickListener(this)
        tombolkatikanahunan.setOnClickListener(this)
        tombolkandayuanaksakula.setOnClickListener(this)
        tombolkandayuuluhhaban.setOnClickListener (this)
        kandayuakanpanganten.setOnClickListener(this)
        tombolkandayuakanhajat.setOnClickListener(this)
        tombolkantuakanuluhmatei.setOnClickListener(this)
        tombolkanyumetngubur.setOnClickListener(this)
        tombolkanyulimngubur.setOnClickListener(this)
        tombolpampetehtuhan.setOnClickListener(this)
        tombolkanyuusaha.setOnClickListener(this)
        tombolkanyupendenghuma.setOnClickListener(this)
        tombolkanyubulihumanew.setOnClickListener(this)
        tomboltombolkanyuparendeng.setOnClickListener(this)
        tombolkanyumambina.setOnClickListener(this)
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
            R.id.tombolkanyunyelutaheta -> {
                val intent = Intent(this, Kanyunyelutaheta::class.java)
                startActivity(intent)
            }
            R.id.tombolkatikanahunan -> {
                val intent = Intent(this, Kanyukatikanahunan::class.java)
                startActivity(intent)
            }
            R.id.tombolkandayuanaksakula -> {
                val intent = Intent(this, Kanyuanaksakula::class.java)
                startActivity(intent)
            }
            R.id.tombolkandayuuluhhaban -> {
                val intent = Intent(this, Kannyuuluhhaban::class.java)
                startActivity(intent)
            }
            R.id.kandayuakanpanganten -> {
                val intent = Intent(this, Kanyupanganten::class.java)
                startActivity(intent)
            }
            R.id.tombolkandayuakanhajat -> {
                val intent = Intent(this, Kanyuhajat::class.java)
                startActivity(intent)
            }
            R.id.tombolkantuakanuluhmatei -> {
                val intent = Intent(this, Kanyuuluhmatei::class.java)
                startActivity(intent)
            }
            R.id.tombolkanyumetngubur -> {
                val intent = Intent(this, Kanyumetngubur::class.java)
                startActivity(intent)
            }
            R.id.tombolkanyulimngubur -> {
                val intent = Intent(this, Kanyulimngubur::class.java)
                startActivity(intent)
            }
            R.id.tombolpampetehtuhan -> {
                val intent = Intent(this, Kanyupamtehtuhan::class.java)
                startActivity(intent)
            }
            R.id.tombolkanyuusaha -> {
                val intent = Intent(this, Kanyuusaha::class.java)
                startActivity(intent)
            }
            R.id.tombolkanyupendenghuma -> {
                val intent = Intent(this, Kanyupendenghuma::class.java)
                startActivity(intent)
            }
            R.id.tombolkanyubulihumanew -> {
                val intent = Intent(this, Kanyubulihumanew::class.java)
                startActivity(intent)
            }
            R.id.tomboltombolkanyuparendeng -> {
                val intent = Intent(this, Kanyuparendeng::class.java)
                startActivity(intent)
            }
            R.id.tombolkanyumambina -> {
                val intent = Intent(this, Kanyumambina::class.java)
                startActivity(intent)
            }
        }
    }
}
