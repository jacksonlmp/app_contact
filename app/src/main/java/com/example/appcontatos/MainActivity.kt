package com.example.appcontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val contactAdapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = contactAdapter


        val contacts = listOf(
            Contact("Jackson", "9999999", "email"),
            Contact("Vita", "9999999", "email"),
            Contact("Raquel", "9999999", "email"),
            Contact("Marcelo", "9999999", "email"),
            Contact("Any", "9999999", "email"),
            Contact("Ana", "9999999", "email")
        )

        contactAdapter.updateItems(contacts)

    }
}