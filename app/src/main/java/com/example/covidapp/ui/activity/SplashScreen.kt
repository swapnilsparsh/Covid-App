package com.example.covidapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.covidapp.R
import com.example.covidapp.utils.goNextScreen
import kotlinx.android.synthetic.main.activity_splash_screen.btnGo

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.CovidApp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        btnGo.setOnClickListener {
            goNextScreen(MainActivity::class.java, true)
        }
    }
}
