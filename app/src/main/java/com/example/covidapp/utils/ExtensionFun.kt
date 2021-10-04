package com.example.covidapp.utils

import android.app.Activity
import android.content.Intent
import android.net.Uri

fun Activity.goNextScreen(nextActivity: Class<*>, isFinished: Boolean = false) {
    startActivity(Intent(this, nextActivity))
    if (isFinished) {
        finish()
    }
}

fun Activity.loadWeb(url: String) {
    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
}
