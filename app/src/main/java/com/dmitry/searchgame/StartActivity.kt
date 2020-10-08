package com.dmitry.searchgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.google.android.gms.ads.*
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        MobileAds.initialize(this) {}
//        mInterstitialAd = InterstitialAd(this)
//        mInterstitialAd.adUnitId = "ca-app-pub-1527580176019846/7747583803"
//        mInterstitialAd.loadAd(AdRequest.Builder().build())
//        MobileAds.setRequestConfiguration(
//            RequestConfiguration.Builder()
//                .setTestDeviceIds(listOf("ABCDEF012345"))
//                .build()
//        )
//
//        mInterstitialAd = InterstitialAd(this).apply {
//            adUnitId = "ca-app-pub-1527580176019846/7747583803"
//            adListener = (
//                    object : AdListener() {
//                        override fun onAdLoaded() {
//                            Toast.makeText(this@StartActivity, "onAdLoaded()", Toast.LENGTH_SHORT).show()
//                        }
//
//                        override fun onAdFailedToLoad(loadAdError: LoadAdError) {
//                            val error = "domain: ${loadAdError.domain}, code: ${loadAdError.code}, " +
//                                    "message: ${loadAdError.message}"
//                            Toast.makeText(
//                                this@StartActivity,
//                                "onAdFailedToLoad() with error $error",
//                                Toast.LENGTH_SHORT
//                            ).show()
//                        }
//
//                        override fun onAdClosed() {
//                            val start = Intent(this@StartActivity, Choose_Test::class.java)
//                            startActivity(start)
//                        }
//                    }
//                    )
//        }

        ButtonStart.setOnClickListener {
//            if (mInterstitialAd.isLoaded) {
//                mInterstitialAd.show()
            val start = Intent(this, Choose_Test::class.java)
            startActivity(start)
        }
        ButtonTraining.setOnClickListener {
            val start = Intent(this, Training::class.java)
            startActivity(start)
        }

    }
}