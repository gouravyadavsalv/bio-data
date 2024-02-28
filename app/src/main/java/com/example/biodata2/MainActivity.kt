package com.example.biodata2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val password = editTextPassword.text.toString()

            if (name == "gourav" && password == "gourav") {
                val intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}