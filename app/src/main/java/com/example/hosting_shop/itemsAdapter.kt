package com.example.hosting_shop

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class itemsAdapter(var items: List<Item>, var context: Context) : RecyclerView.Adapter<itemsAdapter.MyViewHolder>() {
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById(R.id.item_list_image)
        val rating: ImageView = view.findViewById(R.id.item_list_rating)
        val city: TextView = view.findViewById(R.id.item_list_city)
        val title: TextView = view.findViewById(R.id.item_list_title)
        val weigh: TextView = view.findViewById(R.id.item_list_weigh)
        val price: TextView = view.findViewById(R.id.item_list_price)
        val button: Button = view.findViewById(R.id.button_to_item)
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
      holder.price.text = "$" + items[position].price.toString()

      var imageId = context.resources.getIdentifier(
          items[position].image,
          "drawable",
          context.packageName
      )
      holder.image.setImageResource(imageId)

        holder.button.setOnClickListener {
            val intent = Intent(context, ItemActivity::class.java)

            intent.putExtra("itemTitle", items[position].title)
            intent.putExtra("itemCity", items[position].city)
            intent.putExtra("itemWeigh", items[position].weigh)
            intent.putExtra("itemPrice",  items[position].price.toString())
            intent.putExtra("itemDesc", items[position].desc)
            intent.putExtra("itemImage", imageId)

            context.startActivity(intent)
        }

        if (position % 2 == 1) {
            val drawable: Drawable? = ContextCompat.getDrawable(context, R.drawable.rounded_background2)
            val drawableImage: Drawable? = ContextCompat.getDrawable(context, R.drawable.image_background2)
            holder.itemView.background = drawable
            holder.image.background = drawableImage
        } else {
            val drawable: Drawable? = ContextCompat.getDrawable(context, R.drawable.rounded_background)

            holder.itemView.background = drawable
        }


    }
}