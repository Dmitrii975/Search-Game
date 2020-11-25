package com.dmitry.searchgame.searchgametest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dmitry.searchgame.R
import kotlinx.android.synthetic.main.activity_search_game_finish.*

class SearchGameFinish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_game_finish)
        FinishButton.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
                startActivity(intent)
        }
    }
}