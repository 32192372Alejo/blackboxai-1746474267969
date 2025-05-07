package com.example.interviewface

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.interviewface.databinding.ActivityBlankBinding

class BlankActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBlankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlankBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    Toast.makeText(this, "Inicio selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.navigation_interviews -> {
                    Toast.makeText(this, "Entrevistas selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.navigation_comments -> {
                    Toast.makeText(this, "Comentarios selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.navigation_profile -> {
                    Toast.makeText(this, "Perfil selected", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.navigation_more -> {
                    Toast.makeText(this, "Más selected", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> {
                    Log.e("BottomNav", "Unknown navigation item selected")
                    false
                }
            }
        }
    }
}
