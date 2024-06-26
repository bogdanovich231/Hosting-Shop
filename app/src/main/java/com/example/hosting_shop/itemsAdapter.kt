package com.example.hosting_shop

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class itemsAdapter(var items: List<Item>, var context: Context) : RecyclerView.Adapter<itemsAdapter.MyViewHolder>() {
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById(R.id.item_list_image)
        val rating: ImageView = view.findViewById(R.id.item_list_rating)
        val city: TextView = view.findViewById(R.id.item_list_city)
        val title: TextView = view.findViewById(R.id.item_list_title)
        val weigh: TextView = view.findViewById(R.id.item_list_weigh)
        val price: TextView = view.findViewById(R.id.item_list_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_in_list, parent,false )
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      holder.title.text = items[position].title
      holder.city.text = items[position].city
      holder.weigh.text = items[position].weigh
      holder.price.text = items[position].price.toString()
    }
}