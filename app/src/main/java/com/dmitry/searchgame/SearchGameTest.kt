package com.dmitry.searchgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.search_game_test.*

class SearchGameTest : AppCompatActivity() {
//    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_game_test)
//            MobileAds.initialize(this){}
//                mAdView = findViewById(R.id.adView)
//                    val adRequest = AdRequest.Builder().build()
//                        mAdView.loadAd(adRequest)

        val q = listOf("2 + 2", "4 + 4", "0")

        val a = listOf("4", "5", "6", "8", "7", "9")

        val c = MainClass(buttonNext, questionField, answerField1, answerField2, answerField3, q, a)
            c.start()
                c.next()
    }
}