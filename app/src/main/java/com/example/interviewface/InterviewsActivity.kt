package com.example.interviewface

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.interviewface.databinding.ActivityBaseScreenBinding

class InterviewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBaseScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaseScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()

        // Set the top bar title
        binding.topBarTitle.text = "Entrevistas"

        // Set click listener for settings button
        binding.settingsButton.setOnClickListener {
            // TODO: Implement settings screen navigation
        }
    }

    override fun onResume() {
        super.onResume()
        binding.bottomNavigation.selectedItemId = R.id.navigation_interviews
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            if (item.itemId == binding.bottomNavigation.selectedItemId) {
                true
            } else {
                when (item.itemId) {
                    R.id.navigation_home -> {
                        val intent = Intent(this, HomeActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                        startActivity(intent)
                        finish()
                        true
                    }
                    R.id.navigation_interviews -> true
                    R.id.navigation_comments -> {
                        val intent = Intent(this, CommentsActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                        startActivity(intent)
                        finish()
                        true
                    }
                    R.id.navigation_profile -> {
                        val intent = Intent(this, ProfileActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                        startActivity(intent)
                        finish()
                        true
                    }
                    R.id.navigation_more -> {
                        val intent = Intent(this, MoreActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                        startActivity(intent)
                        finish()
                        true
                    }
                    else -> false
                }
            }
        }
    }
}
