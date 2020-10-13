package com.example.androidrazr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Log.e("!@N","Button1 have been pressed")

        }

        button2.setOnClickListener {
            Log.e("!@N","Button2 have been pressed")

        }

        button3.setOnClickListener {
            Log.e("!@N","Button3 have been pressed")

        }

        button4.setOnClickListener {
            Log.e("!@N","Button4 have been pressed")

        }
    }
}