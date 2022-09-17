package com.example.full_screen_intent_notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.full_screen_intent_notification.databinding.ActivityFullScreenBinding

class FullScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFullScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFullScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}