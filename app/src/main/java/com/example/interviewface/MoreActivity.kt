package com.example.interviewface

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.interviewface.databinding.ActivityBaseScreenBinding

class MoreActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBaseScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaseScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.selectedItemId = R.id.navigation_more
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            if (item.itemId == binding.bottomNavigation.selectedItemId) {
                true
            } else {
                when (item.itemId) {
                    R.id.navigation_home -> {
                        startActivity(Intent(this, HomeActivity::class.java))
                        finish()
                        true
                    }
                    R.id.navigation_interviews -> {
                        startActivity(Intent(this, InterviewsActivity::class.java))
                        finish()
                        true
                    }
                    R.id.navigation_comments -> {
                        startActivity(Intent(this, CommentsActivity::class.java))
                        finish()
                        true
                    }
                    R.id.navigation_profile -> {
                        startActivity(Intent(this, ProfileActivity::class.java))
                        finish()
                        true
                    }
                    R.id.navigation_more -> true
                    else -> false
                }
            }
        }
    }
}
