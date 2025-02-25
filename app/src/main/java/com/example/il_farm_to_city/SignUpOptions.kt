package com.example.il_farm_to_city

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class SignUpOptions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val iconButton: ImageButton = findViewById(R.id.producerButton)
        iconButton.setOnClickListener {
            // Example: Navigate back to MainActivity
            val intent = Intent(this, SignUpProducer::class.java)
            startActivity(intent)
            finish() // Closes SecondActivity
        }

        val iconButton1: ImageButton = findViewById(R.id.consumerButton)
        iconButton1.setOnClickListener {
            val intent = Intent(this, SignUpConsumer::class.java)
            startActivity(intent)
            finish()
        }
    }
}