package com.example.team_8_project.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.team_8_project.R
import kotlinx.android.synthetic.main.activity_control_parental.*

class ControlParentalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control_parental)
    }


    fun buttonPressedParentalControl(view: View){
        val usernameText: EditText = findViewById(R.id.emailText)
        val passwordText: EditText = findViewById(R.id.passwordText)
        if(emailText.text.toString()  == "parinte@yahoo.com" && passwordText.text.toString() == "parinte") {
            val toast = Toast.makeText(
                applicationContext,
                "The Parental Control has been turned ON",
                Toast.LENGTH_LONG
            )
            toast.show()

        }

    }
}