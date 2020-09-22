package com.dmitry.searchgame

import android.widget.TextView

class MainClass (val buttonNext: TextView, var QuestionView: TextView, var AnswerView1: TextView, var AnswerView2: TextView, var AnswerView3: TextView,
                 val questions: ArrayList<String>, val answers: ArrayList<String>, ) {

    private var nowQuestion = 0
        private var nowAnswer = 0

    fun start () {
        QuestionView.text = questions[nowQuestion]
            nowQuestion++
        AnswerView1.text = answers[nowAnswer]
            nowAnswer++
        AnswerView2.text = answers[nowAnswer]
            nowAnswer++
        AnswerView3.text = answers[nowAnswer]
            nowAnswer++
    }
    //По идее можно сделать рандом нужно просто игратся с числами а точнее с индексами
    fun Next () {
        for (i in questions){
            QuestionView.text = questions[nowQuestion]
                nowQuestion++
            AnswerView1.text = answers[nowAnswer]
                nowAnswer++
            AnswerView2.text = answers[nowAnswer]
                nowAnswer++
            AnswerView3.text = answers[nowAnswer]
                nowAnswer++
            buttonNext.setOnClickListener {  } // есть сомнения
        }
    }
}