package com.example.androidrazr

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Log.e("!@N","Button1 have been pressed")
            val toast = Toast.makeText(this, "Button1 have been pressed", Toast.LENGTH_LONG)
            toast.show()

        }

        button2.setOnClickListener {
            Log.e("!@N","Button2 have been pressed")
            val toast = Toast.makeText(this, "Button2 have been pressed", Toast.LENGTH_LONG)
            toast.show()

        }

        button3.setOnClickListener {
            Log.e("!@N","Button3 have been pressed")
            val toast = Toast.makeText(this, "Button3 have been pressed", Toast.LENGTH_LONG)
            toast.show()

        }

        button4.setOnClickListener {
            Log.e("!@N","Button4 have been pressed")
            val toast = Toast.makeText(this, "Button4 have been pressed", Toast.LENGTH_LONG)
            toast.show()

        }
    }
}