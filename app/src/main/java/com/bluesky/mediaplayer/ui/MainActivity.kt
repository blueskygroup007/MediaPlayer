package com.bluesky.mediaplayer.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.bluesky.mediaplayer.R
import com.bluesky.mediaplayer.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var splashScreen=installSplashScreen()
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }



    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }
}