package com.applycation.cat_diary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class RegistrationWindow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration_window)

        val vLog: EditText = findViewById(R.id.vLog)
        val vPass: EditText = findViewById(R.id.vPass)
        val buttonSingIn: Button = findViewById(R.id.sing_in)


        buttonSingIn.setOnClickListener {
//            if (!(!(vLog.text.isNotEmpty() && vPass.text.isNotEmpty()) ||
//                        (vLog.text.length < 5)) && (vPass.text.length > 5)){ moveToNextScreen() }

//            when {
//                (vLog.text.isBlank()) ->
//            }
        }



    }

    private fun moveToNextScreen() {
        val intent = Intent(this, SecondActivity::class.java)

        startActivity(intent)
    }


}