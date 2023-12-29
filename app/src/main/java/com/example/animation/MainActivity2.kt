package com.example.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val act1=findViewById<Button>(R.id.act1)
        val act3=findViewById<Button>(R.id.act3)

        act1.setOnClickListener(){
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_in,R.anim.slide_left_in_out)

        }
        act3.setOnClickListener(){
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_in,R.anim.slide_right_in_out)

        }
    }
}