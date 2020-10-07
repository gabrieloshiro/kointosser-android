package com.example.kointosser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.kointosser.kointosser.KoinTosser
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var tossButton: Button
    private lateinit var resultText: TextView

    private var koinTosser = KoinTosser()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        setupResultText()
        setupTossButton()
    }

    private fun setupResultText() {
        resultText = findViewById(R.id.result)
    }

    private fun setupTossButton() {
        tossButton = findViewById(R.id.toss)
        tossButton.setOnClickListener {
            resultText.text = koinTosser.toss().name.toUpperCase(Locale.getDefault())
        }
    }

}