package com.example.recyclersample

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AddFlowerActivity(val flowerList : MutableList<String>) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_flower_layout)

        val button = findViewById<Button>(R.id.doneButton)
        val editText = findViewById<EditText>(R.id.editText)
        button.setOnClickListener {
            println("Edit text: " + editText.text)
            println("List size: " + flowerList.size)

        }
    }
}