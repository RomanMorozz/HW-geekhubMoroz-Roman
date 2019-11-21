package com.example.kotlinrecyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

import android.app.Activity
import android.os.AsyncTask
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val contacts=createContacts ()
        rvContacts.adapter = ContactAdapter(this, contacts)
        rvContacts.layoutManager = LinearLayoutManager(this)
    }

    private fun createContacts(): List<Contact> {
        val contacts = mutableListOf<Contact>()
        for (i in 1..100) contacts.add(Contact("Person @$i",i))
        return contacts

    }
}
