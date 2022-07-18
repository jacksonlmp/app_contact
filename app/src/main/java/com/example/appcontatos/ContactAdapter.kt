package com.example.appcontatos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter: RecyclerView.Adapter<ContactViewHolder>() {

    private var items = listOf<Contact>()

    fun updateItems(newItems: List<Contact>) {
        items = newItems
        //notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_contact, parent, false)

        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(items[position])
    }
}