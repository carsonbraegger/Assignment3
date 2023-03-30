package com.example.fooddiary

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var homeButton2: Button
class NewEntry : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_entry)
        homeButton2=findViewById(R.id.HomeButton2)
        homeButton2.setOnClickListener{
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}