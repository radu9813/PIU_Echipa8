package com.example.team_8_project.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.team_8_project.R

class ShopListActivity : AppCompatActivity()
{
    private lateinit var txtViewList: TextView
    private lateinit var editTextView: EditText
    private lateinit var insertElement: Button

    private lateinit var valueToPutInList: String
    private lateinit var valueFromEditText: String
    private var orderInList: Int = 1

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_list)

        txtViewList = findViewById(R.id.txtViewList)
        editTextView = findViewById(R.id.elementToAddInList)
        insertElement = findViewById(R.id.btnInsertInList)

        insertElement.setOnClickListener {
            valueFromEditText = editTextView.text.toString()

        }
    }
}