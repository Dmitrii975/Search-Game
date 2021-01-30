package com.dmitry.searchgame.searchgametest

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dmitry.searchgame.R
import kotlinx.android.synthetic.main.activity_training.*
import kotlinx.android.synthetic.main.search_game_test.answerField1
import kotlinx.android.synthetic.main.search_game_test.answerField2
import kotlinx.android.synthetic.main.search_game_test.answerField3
import kotlinx.android.synthetic.main.search_game_test.buttonNext
import kotlinx.android.synthetic.main.search_game_test.questionField


class SearchGameTest : AppCompatActivity(){
    private val context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_game_test)
        val question1 = Question(resources.getString(R.string.Question1), resources.getString(R.string.Question1_Answer1),
            resources.getString(R.string.Question1_Answer2),
            resources.getString(R.string.Question1_Answer3))
        val question2 = Question(resources.getString(R.string.Question2), resources.getString(R.string.Question2_Answer1), resources.getString(R.string.Question2_Answer2),
            resources.getString(R.string.Question2_Answer3))
        val question3 = Question(resources.getString(R.string.Question3), resources.getString(R.string.Question3_Answer1), resources.getString(R.string.Question3_Answer2), resources.getString(R.string.Question3_Answer3))
        val question4 = Question(resources.getString(R.string.Question4), resources.getString(R.string.Question4_Answer1), resources.getString(R.string.Question4_Answer2), resources.getString(R.string.Question4_Answer3))
        val question5 = Question(resources.getString(R.string.Question5), resources.getString(R.string.Question5_Answer1), resources.getString(R.string.Question5_Answer2),
            resources.getString(R.string.Question5_Answer3))
        val question6 = Question(resources.getString(R.string.Question6), resources.getString(R.string.Question6_Answer1), resources.getString(R.string.Question6_Answer2), resources.getString(R.string.Question6_Answer3))
        val question7 = Question(resources.getString(R.string.Question7), resources.getString(R.string.Question7_Answer1), resources.getString(R.string.Question7_Answer2), resources.getString(R.string.Question7_Answer3))
        val question8 = Question(resources.getString(R.string.Question8), resources.getString(R.string.Question8_Answer1), resources.getString(R.string.Question8_Answer2), resources.getString(R.string.Question8_Answer3))
        val question9 = Question(resources.getString(R.string.Question9), resources.getString(R.string.Question9_Answer1), resources.getString(R.string.Question9_Answer2),
            resources.getString(R.string.Question9_Answer3))
        val question10 = Question(resources.getString(R.string.Question10), resources.getString(R.string.Question10_Answer1), resources.getString(R.string.Question10_Answer2), resources.getString(R.string.Question10_Answer3))
        val question11 = Question(resources.getString(R.string.Question11), resources.getString(R.string.Question11_Answer1), resources.getString(R.string.Question11_Answer2), resources.getString(R.string.Question11_Answer3))
        val question12 = Question(resources.getString(R.string.Question12), resources.getString(R.string.Question12_Answer1), resources.getString(R.string.Question12_Answer2),
            resources.getString(R.string.Question12_Answer3))
        val question13 = Question(resources.getString(R.string.Question13), resources.getString(R.string.Question13_Answer1), resources.getString(R.string.Question13_Answer2), resources.getString(R.string.Question13_Answer3))
        val question14 = Question(resources.getString(R.string.Question14), resources.getString(R.string.Question14_Answer1), resources.getString(R.string.Question14_Answer2), resources.getString(R.string.Question14_Answer3))
        val question15 = Question(resources.getString(R.string.Question15), resources.getString(R.string.Question15_Answer1), resources.getString(R.string.Question15_Answer2), resources.getString(R.string.Question15_Answer3))

        val questions: Array<Question> = arrayOf(question1,question2,question3,question4,question5,
            question6,question7,question8,question9,question10,question11,question12,question13,question14,question15)

        val mainClass = MainClass(questions,buttonNext,questionField,answerField1,answerField2,answerField3,buttonRestart,context,false)
        mainClass.main(false)
    }
}