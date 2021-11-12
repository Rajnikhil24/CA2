package com.example.ca2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val button1 = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, QUESTION1::class.java)
            startActivity(intent)
        }
        button1.setOnClickListener {
            val intent = Intent(this, QUESTION2::class.java)
            startActivity(intent)
        }
    }
}