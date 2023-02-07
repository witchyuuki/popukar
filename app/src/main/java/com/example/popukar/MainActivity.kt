package com.example.popukar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener{

        }
        b2.setOnClickListener{

        }
        b3.setOnClickListener{
            val intent = Intent(this@MainActivity, Mudrock::class.java)
            startActivity(intent)
        }
        b4.setOnClickListener{

        }
    }
}