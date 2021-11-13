package com.example.myq2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myq2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.radioButton.setOnClickListener {
            Toast.makeText(this, binding.radioButton.text, Toast.LENGTH_SHORT).show()
        }
        binding.radioButton2.setOnClickListener {
            Toast.makeText(this, binding.radioButton2.text, Toast.LENGTH_SHORT).show()
        }
        binding.radioButton3.setOnClickListener {
            Toast.makeText(this, binding.radioButton3.text, Toast.LENGTH_SHORT).show()
        }
        binding.radioButton4.setOnClickListener {
            Toast.makeText(this, binding.radioButton4.text, Toast.LENGTH_SHORT).show()
        }

        binding.submitButton.setOnClickListener {
            Toast.makeText(this, "Enjoy Your Trip !", Toast.LENGTH_SHORT).show()
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}