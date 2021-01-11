package com.example.team_8_project.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.team_8_project.R
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.meniu_activity.*

class MeniuActivity : AppCompatActivity()
{
    private var imagesList = mutableListOf<Int>()
    private var textButtons = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.meniu_activity)

        addToList()

        rv_recyclerView.layoutManager = LinearLayoutManager(this)
        rv_recyclerView.adapter = RecyclerAdapter(imagesList,textButtons)
    }

    private fun addToList()
    {
        textButtons.add("Control Parental")
        textButtons.add("Create Group")
        textButtons.add("Donate")
        textButtons.add("Languages")
        textButtons.add("Exchange")
        textButtons.add("Pay Bills")
        textButtons.add("Bills reminder")
        textButtons.add("Shop list")
        textButtons.add("Wish list")
        textButtons.add("Split bill")
        textButtons.add("Social Networks")
        textButtons.add("Money Manage")

        imagesList.add(R.drawable.controlparental)
        imagesList.add(R.drawable.creategroup)
        imagesList.add(R.drawable.donate)
        imagesList.add(R.drawable.languages)
        imagesList.add(R.drawable.exchange)
        imagesList.add(R.drawable.paybills)
        imagesList.add(R.drawable.billsreminder)
        imagesList.add(R.drawable.shoplist)
        imagesList.add(R.drawable.wishlist)
        imagesList.add(R.drawable.splitbill)
        imagesList.add(R.drawable.socialnetworks)
        imagesList.add(R.drawable.moneymanage)
    }
}