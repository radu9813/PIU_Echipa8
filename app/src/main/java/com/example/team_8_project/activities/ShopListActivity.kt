package com.example.team_8_project.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.team_8_project.R
import kotlinx.android.synthetic.main.activity_shop_list.*

class ShopListActivity : AppCompatActivity()
{
    private lateinit var txtViewList: TextView
    private lateinit var editTextView: EditText
    private lateinit var insertElement: Button
    private lateinit var resetTxtView: Button

    private var valueToPutInList: String = ""
    private lateinit var valueFromEditText: String
    private var orderInList: Int = 1

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_list)

        txtViewList = findViewById(R.id.txtViewList)
        editTextView = findViewById(R.id.elementToAddInList)
        insertElement = findViewById(R.id.btnInsertInList)
        resetTxtView = findViewById(R.id.btnResetListOfShopping)

        insertElement.setOnClickListener {
            valueFromEditText = editTextView.text.toString()
            valueToPutInList += "$orderInList)$valueFromEditText\n"

            orderInList++
            txtViewList.text = valueToPutInList
            editTextView.text.clear()
            Toast.makeText(applicationContext,"Ati inserat "+valueFromEditText+"!",Toast.LENGTH_LONG).show()
        }

        btnResetListOfShopping.setOnClickListener {
            txtViewList.text = ""
            valueToPutInList = ""
            orderInList = 1
            Toast.makeText(applicationContext,"Lista de cumparaturi s-a resetat!",Toast.LENGTH_LONG).show()
        }
    }
}