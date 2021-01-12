package com.example.team_8_project.activities

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.example.team_8_project.R
import kotlinx.android.synthetic.main.activity_main.*

class SplitBillActivity : AppCompatActivity() {
    private lateinit var sumbitButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_split_bill)
        sumbitButton=findViewById(R.id.buttonDownload)
        //submitButton.setOnClickListener{showDownload()}

    }
    fun showDownload(view: View) {
        val dialogBuilder = AlertDialog.Builder(this)

        dialogBuilder.setMessage("DOWNLOADING PDF")
        dialogBuilder.setPositiveButton("Done", DialogInterface.OnClickListener { _, _ -> })
        val b = dialogBuilder.create()
        b.show()
    }
}