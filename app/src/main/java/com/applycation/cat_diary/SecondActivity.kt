package com.applycation.cat_diary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val secondText: TextView = findViewById(R.id.second_text)
        val text: EditText = findViewById(R.id.vLog)


        secondText.text = text.toString()   //я без понятия как это сделать
    }
}