package com.example.team_8_project.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import com.example.team_8_project.R

class WishListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wish_list)
    }

    fun buttonPressed(view: View){
        val toast = Toast.makeText(applicationContext, "Goal was set Successfully", Toast.LENGTH_LONG)
        toast.show()

    }
}