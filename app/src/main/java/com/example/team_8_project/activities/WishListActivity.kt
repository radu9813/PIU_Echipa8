package com.example.team_8_project.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.team_8_project.R

class WishListActivity : AppCompatActivity() {
    private lateinit var imageLambo: ImageView
    private lateinit var textViewLambo: TextView
    private lateinit var textToCompare: EditText
    private lateinit var goaltoCompare: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_wish_list)
        imageLambo=findViewById(R.id.imageLambo)

        textViewLambo=findViewById(R.id.textLambo)
        textToCompare=findViewById(R.id.goal_name_id)
        goaltoCompare=findViewById(R.id.goal_price_id)
    }


    fun buttonPressed(view: View){



        if(textToCompare.text.contains("Lamborghini") && goaltoCompare.text.contains("80000")) {

            imageLambo.visibility = View.VISIBLE
            textViewLambo.visibility=View.VISIBLE
            val toast = Toast.makeText(applicationContext, "Goal was set Successfully", Toast.LENGTH_LONG)
            toast.show()
        }
        else{
            println("NOT OK"+textToCompare.text+" "+goaltoCompare.text)
        }



    }
}