package com.example.team_8_project.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.example.team_8_project.R

class PayBillsActivity : AppCompatActivity() {
    private lateinit var bill: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay_bills)

        bill = findViewById(R.id.bill_1)
    }

    fun payBill(view: View) {
        val intent = Intent(this@PayBillsActivity, PaySelectedBillActivity::class.java)
        startActivity(intent)
    }
}