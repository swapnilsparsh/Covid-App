package com.example.covidapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.covidapp.R
import com.example.covidapp.databinding.ActivitySplashScreenBinding
import com.example.covidapp.utils.goNextScreen

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.CovidApp)
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGo.setOnClickListener {
            goNextScreen(MainActivity::class.java, true)
        }
    }
}
