package com.nativemobilebits.postoffice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.nativemobilebits.postoffice.onboarding.OnboardingActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_main)
        goToOnboardingScreen()
    }


    private fun goToOnboardingScreen(){
        startActivity(Intent(this@MainActivity, OnboardingActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK  or Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }


}

