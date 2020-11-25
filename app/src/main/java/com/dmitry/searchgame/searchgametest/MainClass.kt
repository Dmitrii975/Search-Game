package com.dmitry.searchgame.searchgametest

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class MainClass()
{
    private var counter = 0
    @SuppressLint("SetTextI18n")
    fun main(buttonNext: Button,
             questionField: TextView,
             answerField1: Button,
             answerField2: Button,
             answerField3: Button,
             questions: Array<String>,
             answers: Array<Array<String>>,
             context: Context,
            isEnd: Boolean) {

            if (isEnd){
                val i = Intent(context, SearchGameFinish::class.java)
                    val b: Bundle? = i.extras
                        startActivity(context, i, b)
                return
            }

            questionField.text = questions[counter]
            answerField1.text = answers[counter][0]
            answerField2.text = answers[counter][1]
            answerField3.text = answers[counter][2]
            answerField1.isClickable = true
            answerField2.isClickable = true
            answerField3.isClickable = true
            answerField1.setOnClickListener {
                questionField.text = "Ответ верный."
                answerField1.text = ""
                answerField2.text = ""
                answerField3.text = ""
                answerField1.isClickable = false
                answerField2.isClickable = false
                answerField3.isClickable = false
            }
            answerField2.setOnClickListener {
                questionField.text = "Увы, ответ не верный"
                answerField1.text = ""
                answerField2.text = ""
                answerField3.text = ""
                answerField1.isClickable = false
                answerField2.isClickable = false
                answerField3.isClickable = false
            }
            answerField3.setOnClickListener {
                questionField.text = "Увы, ответ не верный"
                answerField1.text = ""
                answerField2.text = ""
                answerField3.text = ""
                answerField1.isClickable = false
                answerField2.isClickable = false
                answerField3.isClickable = false
            }
            buttonNext.setOnClickListener {
                counter++
                if (counter == questions.size)
                    main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, true)
                else
                    main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, false)
            }

//      для перехода к финишу
//            val i = Intent(context, SearchGameFinish::class.java)
//                val b: Bundle? = i.extras
//                    startActivity(context, i, b)
    }
}
