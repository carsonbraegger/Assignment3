package com.example.fooddiary

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var homeButton: Button
class food_Diary : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_diary)
        homeButton=findViewById(R.id.HomeButton)
        homeButton.setOnClickListener{
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}