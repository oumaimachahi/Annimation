package com.example.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn1=findViewById<Button>(R.id.button)
        val btn2=findViewById<Button>(R.id.button2);


        btn1.setOnClickListener(){
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_in,R.anim.slide_right_in_out)

        }
        btn2.setOnClickListener(){
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_in,R.anim.slide_right_in_out)

        }
    }
}