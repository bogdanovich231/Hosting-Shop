package com.example.hosting_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val categoryList: RecyclerView = findViewById(R.id.categoryList)
        val categories = listOf("Flowers", "Pre Rolls", "Seeds", "Edibles")
        val categoryAdapter = CategoryAdapter(categories, this)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        categoryList.layoutManager = layoutManager
        categoryList.adapter = categoryAdapter

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = mutableListOf<Item>()
        items.add(Item(1, "mar1", "rating", "Alaskan", "Thunderfuck\n" + "Strain", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "10g /", 100))
        items.add(Item(2, "mar2", "rating", "Alaskan", "Thunderfuck\n" + "Strain", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "10g /", 100))
        items.add(Item(3, "mar3", "rating", "Alaskan", "Thunderfuck\n" + "Strain", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", "10g /", 100))

        val itemsLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        itemsList.layoutManager = itemsLayoutManager
        itemsList.adapter = itemsAdapter(items, this)
    }
}