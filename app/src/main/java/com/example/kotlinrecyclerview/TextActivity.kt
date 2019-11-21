package com.example.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinrecyclerview.ui.text.TextFragment

class TextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.text_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, TextFragment.newInstance())
                .commitNow()
        }
    }

}
