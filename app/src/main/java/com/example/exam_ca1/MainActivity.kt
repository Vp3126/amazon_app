package com.example.exam_ca1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val signInButton = findViewById<Button>(R.id.signInButton)
        val createAccountButton = findViewById<Button>(R.id.createAccountButton)

        signInButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()
            if (email.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Signing in...", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }
        }

        createAccountButton.setOnClickListener {
            Toast.makeText(this, "Redirecting to account creation...", Toast.LENGTH_SHORT).show()

        }
    }
}
