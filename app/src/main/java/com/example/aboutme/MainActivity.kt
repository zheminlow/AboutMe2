package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDone : Button = findViewById(R.id.done_button)

        btnDone.setOnClickListener() {
            val tvInput : TextView = findViewById(R.id.nickname_edit)
            val tvResult : TextView = findViewById(R.id.tvResult)

            tvResult.text = tvInput.text

            btnDone.visibility = View.GONE
            tvInput.visibility = View.GONE
            tvResult.visibility = View.VISIBLE

        }
    }
}