package com.applycation.cat_diary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSingIn: Button = findViewById(R.id.sing_in)
        buttonSingIn.setOnClickListener { moveToNextScreen() }
    }

    private fun moveToNextScreen() {
        val intent = Intent(this, SecondActivity::class.java)

        startActivity(intent)
    }
}