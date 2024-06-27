package com.example.hosting_shop

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ItemActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val image: ImageView = findViewById(R.id.item_list_image)
        val city: TextView = findViewById(R.id.item_list_city)
        val title: TextView = findViewById(R.id.item_list_title)
        val weigh: TextView = findViewById(R.id.item_list_weigh)
        val price: TextView = findViewById(R.id.item_list_price)
        val desc: TextView = findViewById(R.id.item_list_decs)

        val imageId = intent.getIntExtra("itemImage", -1)
        title.text = intent.getStringExtra("itemTitle")
        weigh.text = intent.getStringExtra("itemWeigh")
        price.text = intent.getStringExtra("itemPrice")
        desc.text = intent.getStringExtra("itemDesc")
        city.text = intent.getStringExtra("itemCity")

        if (imageId != -1) {
            image.setImageResource(imageId)
        }

    }

}