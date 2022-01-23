package com.example.simulator.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.HandlerCompat.postDelayed
import com.example.simulator.R

class splashScreem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screem)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
            finish()
        },3000)

    }
}