package com.dmitry.searchgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.search_game_test.*

class SearchGameTest : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_game_test)
            MobileAds.initialize(this){}
//                mAdView = findViewById(R.id.adView)
//                    val adRequest = AdRequest.Builder().build()
//                        mAdView.loadAd(adRequest)
        val q = ArrayList<String>()
            q.add("2 + 2")
        val a = ArrayList<String>()
            a.add("4")
                a.add("5")
                    a.add("6")
        val c = MainClass(ButtonNext, QuestionField, AnswerField1, AnswerField2, AnswerField3, q, a)
            c.start()
    }
}