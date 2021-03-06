package com.example.team_8_project.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.team_8_project.R

class BillsReminderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bills_reminder)
    }

    fun remindMe(view: View) {
        Toast.makeText(applicationContext,"Bill reminder saved!", Toast.LENGTH_SHORT).show()
    }
}