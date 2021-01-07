package com.dmitry.searchgame.searchgametest

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dmitry.searchgame.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.reward.RewardedVideoAd
import com.google.android.gms.ads.reward.RewardedVideoAdListener
import kotlinx.android.synthetic.main.search_game_test.*


class SearchGameTest : AppCompatActivity(){
    private val context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_game_test)
        val answer: Array<Array<String>> = Array(15)
        {
            Array(3)
            {
                ""
            }
        }
        answer[0] = arrayOf(resources.getString(R.string.Question1_Answer1), resources.getString(R.string.Question1_Answer2),
            resources.getString(R.string.Question1_Answer3))

        answer[1] = arrayOf(resources.getString(R.string.Question2_Answer1), resources.getString(R.string.Question2_Answer2),
            resources.getString(R.string.Question2_Answer3))

        answer[2] = arrayOf(resources.getString(R.string.Question3_Answer1), resources.getString(R.string.Question3_Answer2), resources.getString(R.string.Question3_Answer3))

        answer[3] = arrayOf(resources.getString(R.string.Question4_Answer1), resources.getString(R.string.Question4_Answer2), resources.getString(R.string.Question4_Answer3))
        
        answer[4] = arrayOf(resources.getString(R.string.Question5_Answer1), resources.getString(R.string.Question5_Answer2),
            resources.getString(R.string.Question5_Answer3))
        answer[5] = arrayOf(resources.getString(R.string.Question6_Answer1), resources.getString(R.string.Question6_Answer2), resources.getString(R.string.Question6_Answer3))
        answer[6] = arrayOf(resources.getString(R.string.Question7_Answer1), resources.getString(R.string.Question7_Answer2), resources.getString(R.string.Question7_Answer3))
        answer[7] = arrayOf(resources.getString(R.string.Question8_Answer1), resources.getString(R.string.Question8_Answer2), resources.getString(R.string.Question8_Answer3))
        answer[8] = arrayOf(resources.getString(R.string.Question9_Answer1), resources.getString(R.string.Question9_Answer2),
            resources.getString(R.string.Question9_Answer3))
        answer[9] = arrayOf(resources.getString(R.string.Question10_Answer1), resources.getString(R.string.Question10_Answer2), resources.getString(R.string.Question10_Answer3))
        answer[10] = arrayOf(resources.getString(R.string.Question11_Answer1), resources.getString(R.string.Question11_Answer2), resources.getString(R.string.Question11_Answer3))
        answer[11] = arrayOf(resources.getString(R.string.Question12_Answer1), resources.getString(R.string.Question12_Answer2),
            resources.getString(R.string.Question12_Answer3))
        answer[12] = arrayOf(resources.getString(R.string.Question13_Answer1), resources.getString(R.string.Question13_Answer2), resources.getString(R.string.Question13_Answer3))
        answer[13] = arrayOf(resources.getString(R.string.Question14_Answer1), resources.getString(R.string.Question14_Answer2), resources.getString(R.string.Question14_Answer3))
        answer[14] = arrayOf(resources.getString(R.string.Question15_Answer1), resources.getString(R.string.Question15_Answer2), resources.getString(R.string.Question15_Answer3))

        val question: Array<String> = arrayOf(resources.getString(R.string.Question1),
            resources.getString(R.string.Question2),
            resources.getString(R.string.Question3),
            resources.getString(R.string.Question4),
            resources.getString(R.string.Question5),
            resources.getString(R.string.Question6),
            resources.getString(R.string.Question7),
            resources.getString(R.string.Question8),
            resources.getString(R.string.Question9),
            resources.getString(R.string.Question10),
            resources.getString(R.string.Question11),
            resources.getString(R.string.Question12),
            resources.getString(R.string.Question13),
            resources.getString(R.string.Question14),
            resources.getString(R.string.Question15))

        val clazz = MainClass(question,answer,buttonNext,questionField,answerField1,answerField2,answerField3,context)
            clazz.main(isEnd = false)
    }
}