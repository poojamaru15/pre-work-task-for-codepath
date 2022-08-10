package com.example.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Display customized to show 'Hello from (name)'

        findViewById<Button>(R.id.button).setOnClickListener {
         Log.i("Pooja","Tapped on Button")

            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.teal_200))

        }

    }


}