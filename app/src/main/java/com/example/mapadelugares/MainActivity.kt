package com.example.mapadelugares

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtener botones
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)

        // Centro Comercial
        btn1.setOnClickListener {
            abrirMapa(4.6367, -74.0841, "Centro Comercial")
        }

        // Parque Central
        btn2.setOnClickListener {
            abrirMapa(4.6379, -74.0825, "Parque Central")
        }

        // Plaza Principal
        btn3.setOnClickListener {
            abrirMapa(4.6391, -74.0813, "Plaza Principal")
        }

        // Estadio
        btn4.setOnClickListener {
            abrirMapa(4.6402, -74.0801, "Estadio Municipal")
        }
    }

    private fun abrirMapa(lat: Double, lng: Double, titulo: String) {
        val intent = Intent(this, MapsActivity::class.java)
        intent.putExtra("lat", lat)
        intent.putExtra("lng", lng)
        intent.putExtra("titulo", titulo)
        startActivity(intent)
    }
}