package com.example.appcontatos

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val textViewName = itemView.findViewById<TextView>(R.id.tvName)
    private val textViewTelephone = itemView.findViewById<TextView>(R.id.tvTelephone)

    //Recebendo instancia
    //Manda informações para tela
    fun bind(item: Contact){
        textViewName.text = item.name
        textViewName.text = item.telephone
    }

}