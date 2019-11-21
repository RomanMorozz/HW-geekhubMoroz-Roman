package com.example.kotlinrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.item_contact.view.*


class ContactAdapter(private val context: Context, private val contacts: List<Contact> )
    :RecyclerView.Adapter<ContactAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_contact, parent,false))
    }
    override fun getItemCount()=contacts.size
    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }
            inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
                fun bind(contact: Contact) {
                itemView.tvName.text = contact.name
                itemView.tvAge.text = "Age: ${contact.age}"
            }

        }
}