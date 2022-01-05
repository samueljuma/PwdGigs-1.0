package com.devjay.pwdgigs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*
        *If you want to show your splash screen for some amount of time (like five secs)
        * you can create a Handler , also using a timer can help you fetch data from the
        * cloud on your MainActivity which could be a better approach than to show a
        * dialog on home screen.*/

        Handler(Looper.getMainLooper()).postDelayed(
            Runnable {

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 3000
        )


    }
}