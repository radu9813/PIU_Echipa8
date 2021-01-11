package com.example.team_8_project.activities

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.team_8_project.R
import kotlinx.android.synthetic.main.activity_exchange.*

class ExchangeActivity : AppCompatActivity()
{
    private lateinit var buttonCifra0: Button
    private lateinit var buttonCifra1: Button
    private lateinit var buttonCifra2: Button
    private lateinit var buttonCifra3: Button
    private lateinit var buttonCifra4: Button
    private lateinit var buttonCifra5: Button
    private lateinit var buttonCifra6: Button
    private lateinit var buttonCifra7: Button
    private lateinit var buttonCifra8: Button
    private lateinit var buttonCifra9: Button
    private lateinit var buttonRESET: Button
    private lateinit var buttonGO: Button
    private lateinit var spinner1: Spinner
    private lateinit var spinner2: Spinner
    private lateinit var txtView1: TextView
    private lateinit var txtView2: TextView
    lateinit var adapterSpinner1: Adapter
    lateinit var adapterSpinner2: Adapter

    val myListOfFirstCoin: ArrayList<String> = arrayListOf()
    val myListOfSecondCoin: ArrayList<String> = arrayListOf()

    var value1: String = ""

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exchange)

        buttonCifra0 = findViewById(R.id.btnCifra0)
        buttonCifra1 = findViewById(R.id.btnCifra1)
        buttonCifra2 = findViewById(R.id.btnCifra2)
        buttonCifra3 = findViewById(R.id.btnCifra3)
        buttonCifra4 = findViewById(R.id.btnCifra4)
        buttonCifra5 = findViewById(R.id.btnCifra5)
        buttonCifra6 = findViewById(R.id.btnCifra6)
        buttonCifra7 = findViewById(R.id.btnCifra7)
        buttonCifra8 = findViewById(R.id.btnCifra8)
        buttonCifra9 = findViewById(R.id.btnCifra9)
        buttonRESET = findViewById(R.id.btnReset)
        buttonGO = findViewById(R.id.btnExchange)

        spinner1 = findViewById(R.id.firstCoin)
        spinner2 = findViewById(R.id.secondCoin)

        txtView1 = findViewById(R.id.txtViewFirstCoin)
        txtView2 = findViewById(R.id.txtViewSecondCoin)

        myListOfFirstCoin.add("Leu")
        myListOfFirstCoin.add("Euro")
        myListOfFirstCoin.add("Dolar")

        myListOfSecondCoin.add("Leu")
        myListOfSecondCoin.add("Euro")
        myListOfSecondCoin.add("Dolar")

        makeSpinners()
        ifButtonsClick()

        buttonRESET.setOnClickListener {
            value1=""
            txtViewFirstCoin.text = ""
            txtViewSecondCoin.text = ""
        }

        buttonGO.setOnClickListener {
            val firstCoin: String = spinner1.selectedItem.toString()
            val secondCoin: String = spinner2.selectedItem.toString()

            if(firstCoin.contentEquals("Leu") && secondCoin.contentEquals("Euro"))
            {
                val secondValueInt: Int = value1.toInt()
                val valoareSchimbata: Double = secondValueInt / 4.85

                txtViewSecondCoin.text = valoareSchimbata.toString()
            }
            else if(firstCoin.contentEquals("Leu") && secondCoin.contentEquals("Dolar"))
            {
                val secondValueInt: Int = value1.toInt()
                val valoareSchimbata: Double = secondValueInt * 3.97

                txtViewSecondCoin.text = valoareSchimbata.toString()
            }
            else if(firstCoin.contentEquals("Euro") && secondCoin.contentEquals("Dolar"))
            {
                val secondValueInt: Int = value1.toInt()
                val valoareSchimbata: Double = secondValueInt / 1.22

                txtViewSecondCoin.text = valoareSchimbata.toString()
            }
            else if(firstCoin.contentEquals("Euro") && secondCoin.contentEquals("Leu"))
            {
                val secondValueInt: Int = value1.toInt()
                val valoareSchimbata: Double = secondValueInt * 4.87

                txtViewSecondCoin.text = valoareSchimbata.toString()
            }
            else if(firstCoin.contentEquals("Dolar") && secondCoin.contentEquals("Leu"))
            {
                val secondValueInt: Int = value1.toInt()
                val valoareSchimbata: Double = secondValueInt / 3.99

                txtViewSecondCoin.text = valoareSchimbata.toString()
            }
            else if(firstCoin.contentEquals("Dolar") && secondCoin.contentEquals("Euro"))
            {
                val secondValueInt: Int = value1.toInt()
                val valoareSchimbata: Double = secondValueInt * 0.82

                txtViewSecondCoin.text = valoareSchimbata.toString()
            }
        }
    }

    private fun makeSpinners()
    {
        adapterSpinner1 = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item,
            myListOfFirstCoin
        )
        (adapterSpinner1 as ArrayAdapter<*>).setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adapterSpinner2 = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item,
            myListOfSecondCoin
        )
        (adapterSpinner2 as ArrayAdapter<*>).setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner1.adapter = adapterSpinner1 as ArrayAdapter<*>
        spinner2.adapter = adapterSpinner2 as ArrayAdapter<*>
    }

    private fun ifButtonsClick()
    {
        buttonCifra0.setOnClickListener {
            value1+="0"
            txtViewFirstCoin.text = value1
        }
        buttonCifra1.setOnClickListener {
            value1+="1"
            txtViewFirstCoin.text = value1
        }
        buttonCifra2.setOnClickListener {
            value1+="2"
            txtViewFirstCoin.text = value1
        }
        buttonCifra3.setOnClickListener {
            value1+="3"
            txtViewFirstCoin.text = value1
        }
        buttonCifra4.setOnClickListener {
            value1+="4"
            txtViewFirstCoin.text = value1
        }
        buttonCifra5.setOnClickListener {
            value1+="5"
            txtViewFirstCoin.text = value1
        }
        buttonCifra6.setOnClickListener {
            value1+="6"
            txtViewFirstCoin.text = value1
        }
        buttonCifra7.setOnClickListener {
            value1+="7"
            txtViewFirstCoin.text = value1
        }
        buttonCifra8.setOnClickListener {
            value1+="8"
            txtViewFirstCoin.text = value1
        }
        buttonCifra9.setOnClickListener {
            value1+="9"
            txtViewFirstCoin.text = value1
        }
    }
}