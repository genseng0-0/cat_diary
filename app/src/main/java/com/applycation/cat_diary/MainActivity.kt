package com.applycation.cat_diary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vLog: EditText = findViewById(R.id.vLog)
        val vPass: EditText = findViewById(R.id.vPass)
        val buttonSingIn: Button = findViewById(R.id.sing_in)


        buttonSingIn.setOnClickListener {
            if (!(!(vLog.text.isNotEmpty() && vPass.text.isNotEmpty()) ||
                        (vLog.text.length < 5)) && (vPass.text.length > 5)){ moveToNextScreen() }
        }



    }

    private fun moveToNextScreen() {
        val intent = Intent(this, SecondActivity::class.java)

        startActivity(intent)
    }
}