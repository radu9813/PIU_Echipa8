package com.example.team_8_project.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.team_8_project.R

class PaySelectedBillActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay_selected_bill)
    }

    fun openPaymentApp(view: View) {
        Toast.makeText(applicationContext,"Payment application is opening...", Toast.LENGTH_SHORT).show()
    }
}