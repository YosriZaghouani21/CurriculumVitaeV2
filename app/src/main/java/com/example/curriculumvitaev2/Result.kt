package com.example.curriculumvitaev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val age = intent.getStringExtra("age")
        val gender = intent.getStringExtra("gender")
        val iosSkills = intent.getStringExtra("iosSkills")
        val flutterSkills = intent.getStringExtra("flutterSkills")
        val androidSkills = intent.getStringExtra("androidSkills")

        val nameR = findViewById<TextView>(R.id.name_result)
        val emailR = findViewById<TextView>(R.id.email_result)
        val ageR = findViewById<TextView>(R.id.age_result)
        val genreR = findViewById<TextView>(R.id.genre_result)
        val iosR = findViewById<TextView>(R.id.ios_skills)
        val flutterR = findViewById<TextView>(R.id.flutter_skills)
        val androidR = findViewById<TextView>(R.id.android_skills)

        nameR.text = "Name : "+name
        emailR.text = "Email : "+email
        ageR.text = "Age : "+age
        genreR.text = "Gender : "+gender
        iosR.text = "Ios skills : "+iosSkills+"/100"
        flutterR.text = "Flutter skills : "+flutterSkills+"/100"
        androidR.text = "Android Skills : "+androidSkills+"/100"

        //Toast.makeText(this,iosSkills,Toast.LENGTH_SHORT).show()
    }
}