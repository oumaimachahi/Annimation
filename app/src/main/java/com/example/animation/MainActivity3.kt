package com.example.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val ac1=findViewById<Button>(R.id.ac1)
        val ac2=findViewById<Button>(R.id.ac2)

        ac1.setOnClickListener(){
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_in,R.anim.slide_left_in_out)

        }
        ac2.setOnClickListener(){
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_in,R.anim.slide_left_in_out)

        }
    }
}