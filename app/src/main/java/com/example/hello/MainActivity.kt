package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var TVlogin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TVlogin =findViewById(R.id.TVlogin)
        TVlogin.setOnClickListener {
            val intent = Intent(this,LOGIN2::class.java)
            startActivity(intent)
        }
    }
}