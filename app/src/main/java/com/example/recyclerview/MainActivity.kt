package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val itemList = listOf(
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2"),
            itemDetails("Item 3", "Description 3"),
            itemDetails("Item 1", "Description 1"),
            itemDetails("Item 2", "Description 2")
        )
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = adapterClass(itemList)
    }
}