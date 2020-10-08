package com.dmitry.searchgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_training.*

class Training : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training)
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