package com.dmitry.searchgame.searchgametest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.dmitry.searchgame.R
import com.google.android.gms.ads.*
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        MobileAds.initialize(this) {}

        ButtonStart.setOnClickListener {
            val start = Intent(this, Choose_Test::class.java)
            startActivity(start)
        }
        ButtonTraining.setOnClickListener {
            val start = Intent(this, Training::class.java)
            startActivity(start)
        }
    }
}