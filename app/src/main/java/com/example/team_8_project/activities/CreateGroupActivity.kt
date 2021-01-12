package com.example.team_8_project.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.team_8_project.R

class CreateGroupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_group)
    }

    fun buttonPressedForFamily(view: View){
        val toast = Toast.makeText(applicationContext, "Openning Phone Agenda to add family member to group", Toast.LENGTH_LONG)
        toast.show()

    }

    fun buttonPressedForFriends(view: View){
        val toast = Toast.makeText(applicationContext, "Openning Phone Agenda to add friend to group", Toast.LENGTH_LONG)
        toast.show()

    }

}