package com.example.team_8_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.team_8_project.R
import com.example.team_8_project.menu.MeniuActivity

class MainActivity : AppCompatActivity() {

    private lateinit var errorUsername: TextView
    private lateinit var errorPassword: TextView
    private lateinit var submitMessage: TextView
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        errorUsername = findViewById(R.id.usernameErrorLabel)
        errorPassword = findViewById(R.id.passwordErrorLabel)
        submitMessage = findViewById(R.id.loginInfoLabel)
        submitButton = findViewById(R.id.submitButton)
        submitButton.setOnClickListener() {
            val usernameText: EditText = findViewById(R.id.usernameText)
            val passwordText: EditText = findViewById(R.id.passwordText)
            val message : TextView = findViewById(R.id.loginInfoLabel)
            var isOk = false

            if (usernameText.text.isEmpty() || usernameText.text.length < 3) {
                errorUsername.visibility = View.VISIBLE
                isOk = false
            } else {
                errorUsername.visibility = View.GONE
                isOk = true
            }

            if (passwordText.text.isEmpty() || passwordText.text.length < 3) {
                errorPassword.visibility = View.VISIBLE
                isOk = false
            } else {
                errorPassword.visibility = View.GONE
                isOk = true
            }

            if(isOk){
                if(usernameText.text.toString() == "admin" && passwordText.text.toString() == "admin1") {
                    message.text = getString(R.string.loginSuccessful)
                    message.setTextColor(getColor(R.color.green))
                    message.visibility = View.VISIBLE

                    val intent = Intent(this@MainActivity, MeniuActivity::class.java)
                    startActivity(intent)
                }else{
                    message.text = getString(R.string.loginFailed)
                    message.setTextColor(getColor(R.color.red))
                    message.visibility = View.VISIBLE
                }
            }
        }
    }
}

