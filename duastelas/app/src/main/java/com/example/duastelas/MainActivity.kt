package com.example.duastelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var btnGoToTela2 : Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGoToTela2 = findViewById(R.id.btnGoToT1)
        btnGoToTela2.setOnClickListener{
            val intent = Intent(this, Tela2::class.java)
            startActivity(intent)
        }
    }
}