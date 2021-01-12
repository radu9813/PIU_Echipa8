package com.example.team_8_project.activities

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.team_8_project.R


class DonateActivity : AppCompatActivity() {
    private lateinit var sumbitButton: Button
    private lateinit var imageDaruiesteViata: ImageView
    private lateinit var imageSos: ImageView
    private lateinit var imagehospice: ImageView
    var flag: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donate)
        sumbitButton=findViewById(R.id.buton_donatii)
        imageDaruiesteViata=  findViewById(R.id.daruiesteViata)
        imageSos= findViewById(R.id.sosSatele)
        imagehospice   =findViewById(R.id.hospice)
        sumbitButton.setOnClickListener{ showDialog()  }








        imageDaruiesteViata.setOnClickListener { higlightDaruieste() }
        imageSos.setOnClickListener{higlightSos()}
        imagehospice.setOnClickListener{higlightHospice()}



        //Toast.makeText(this, "MULTUMIM PENTRU DONATIA FACUTA", Toast.LENGTH_SHORT).show()
    }


    fun higlightDaruieste(){
        flag =!flag
        println(flag)
        if(flag) {
            val highlightWhite = resources.getDrawable(R.drawable.shapewhite)
            imageDaruiesteViata.setBackground(highlightWhite);

        }else {
            val highlight = resources.getDrawable(R.drawable.shape)
            imageDaruiesteViata.setBackground(highlight)
        }

    }
    fun higlightSos(){
        flag =!flag
        println(flag)
        if(flag) {
            val highlightWhite = resources.getDrawable(R.drawable.shapewhite)
            imageSos.setBackground(highlightWhite);

        }else {
            val highlight = resources.getDrawable(R.drawable.shape)
            imageSos.setBackground(highlight)
        }
    }
    fun higlightHospice(){
        flag =!flag
        println(flag)
        if(flag) {
            val highlightWhite = resources.getDrawable(R.drawable.shapewhite)
            imagehospice.setBackground(highlightWhite);

        }else {
            val highlight = resources.getDrawable(R.drawable.shape)
            imagehospice.setBackground(highlight)
        }
    }

    fun showDialog() {
        val dialogBuilder = AlertDialog.Builder(this)

        dialogBuilder.setMessage("Multumim pentru donatia facuta  ")
        dialogBuilder.setPositiveButton("Done", DialogInterface.OnClickListener { dialog, whichButton -> })
        val b = dialogBuilder.create()
        b.show()
    }
}