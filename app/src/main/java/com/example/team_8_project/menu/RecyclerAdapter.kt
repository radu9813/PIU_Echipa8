package com.example.team_8_project.menu

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.team_8_project.R
import com.example.team_8_project.activities.*

class RecyclerAdapter(private var images: List<Int>, private var buttons: List<String>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()
{
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val itemImage: ImageView = itemView.findViewById(R.id.iv_image)
        val itemButton: Button = itemView.findViewById(R.id.iv_button)

        init{
            itemView.setOnClickListener { v: View ->
                val position: Int = adapterPosition
                Toast.makeText(
                    itemView.context,
                    "M-ai apasat pe # ${position + 1}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemImage.setImageResource(images[position])
        holder.itemButton.text = buttons[position]

        holder.itemButton.setOnClickListener {
            if(buttons[position].contentEquals("Control Parental"))
            {
                val intent = Intent(holder.itemView.context, ControlParentalActivity::class.java)
                holder.itemView.context.startActivity(intent)
            }
            else if(buttons[position].contentEquals("Create Group"))
            {
                val intent = Intent(holder.itemView.context, CreateGroupActivity::class.java)
                holder.itemView.context.startActivity(intent)
            }
            else if(buttons[position].contentEquals("Donate"))
            {
                val intent = Intent(holder.itemView.context, DonateActivity::class.java)
                holder.itemView.context.startActivity(intent)
            }/*
            else if(buttons[position].contentEquals("Languages"))
            {
                val intent = Intent(holder.itemView.context, LanguagesActivity::class.java)
                holder.itemView.context.startActivity(intent)
            }*/
            else if(buttons[position].contentEquals("Exchange"))
            {
                val intent = Intent(holder.itemView.context, ExchangeActivity::class.java)
                holder.itemView.context.startActivity(intent)
            }
            else if(buttons[position].contentEquals("Pay Bills"))
            {
                val intent = Intent(holder.itemView.context, PayBillsActivity::class.java)
                holder.itemView.context.startActivity(intent)
            }
            else if(buttons[position].contentEquals("Bills reminder"))
            {
                val intent = Intent(holder.itemView.context, BillsReminderActivity::class.java)
                holder.itemView.context.startActivity(intent)
            }
            else if(buttons[position].contentEquals("Shop list"))
            {
                val intent = Intent(holder.itemView.context, ShopListActivity::class.java)
                holder.itemView.context.startActivity(intent)
            }
            else if(buttons[position].contentEquals("Wish list"))
            {
                val intent = Intent(holder.itemView.context, WishListActivity::class.java)
                holder.itemView.context.startActivity(intent)
            }
            else if(buttons[position].contentEquals("Generate Report"))
            {
                val intent = Intent(holder.itemView.context, SplitBillActivity::class.java)
                holder.itemView.context.startActivity(intent)
            }/*
            else if(buttons[position].contentEquals("Social Networks"))
            {
                val intent = Intent(holder.itemView.context, SocialNetworksActivity::class.java)
                holder.itemView.context.startActivity(intent)
            }
            */
            else if(buttons[position].contentEquals("Money Manage"))
            {
                val intent = Intent(holder.itemView.context, MoneyManageActivity::class.java)
                holder.itemView.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return images.size
    }

}