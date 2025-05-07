package com.example.interviewface

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.interviewface.databinding.ActivityBaseScreenBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBaseScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaseScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()
    }

    override fun onResume() {
        super.onResume()
        binding.bottomNavigation.selectedItemId = R.id.navigation_home
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            if (item.itemId == binding.bottomNavigation.selectedItemId) {
                // Already selected, do nothing
                true
            } else {
                when (item.itemId) {
                    R.id.navigation_home -> {
                        android.widget.Toast.makeText(this, "Home clicked", android.widget.Toast.LENGTH_SHORT).show()
                        // Already on home, do nothing
                        true
                    }
                    R.id.navigation_interviews -> {
                        android.widget.Toast.makeText(this, "Interviews clicked", android.widget.Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, InterviewsActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                        startActivity(intent)
                        finish()
                        true
                    }
                    R.id.navigation_comments -> {
                        android.widget.Toast.makeText(this, "Comments clicked", android.widget.Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, CommentsActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                        startActivity(intent)
                        finish()
                        true
                    }
                    R.id.navigation_profile -> {
                        android.widget.Toast.makeText(this, "Profile clicked", android.widget.Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, ProfileActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                        startActivity(intent)
                        finish()
                        true
                    }
                    R.id.navigation_more -> {
                        android.widget.Toast.makeText(this, "More clicked", android.widget.Toast.LENGTH_SHORT).show()
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
