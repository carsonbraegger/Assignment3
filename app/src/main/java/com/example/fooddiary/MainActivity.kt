package com.example.fooddiary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var buttonFoodDiary: Button
lateinit var buttonNewEntry: Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonFoodDiary=findViewById(R.id.foodDiary)
        buttonNewEntry=findViewById(R.id.newEntry)
        buttonFoodDiary.setOnClickListener{
            intent = Intent(this,food_Diary::class.java)
            startActivity(intent)
        }

        buttonNewEntry.setOnClickListener{
            intent = Intent(this,NewEntry::class.java)
                startActivity(intent)

        }
    }
}