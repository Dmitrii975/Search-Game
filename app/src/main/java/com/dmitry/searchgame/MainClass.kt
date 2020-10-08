package com.dmitry.searchgame

import android.annotation.SuppressLint
import android.widget.TextView

class MainClass (
    private val buttonNext: TextView, var QuestionView: TextView, var AnswerView1: TextView, var AnswerView2: TextView, var AnswerView3: TextView,
    private val questions: List<String>, private val answers: List<String>) {

    private var nowQuestion = 0
        private var nowAnswer = 0

    @SuppressLint("SetTextI18n")
    fun start () {
        QuestionView.text = questions[nowQuestion]
            nowQuestion++
        AnswerView1.text = answers[nowAnswer]
            nowAnswer++
        AnswerView2.text = answers[nowAnswer]
            nowAnswer++
        AnswerView3.text = answers[nowAnswer]
            nowAnswer++

        AnswerView1.setOnClickListener {
                QuestionView.text = "Отлично. Ответ верный."
                    AnswerView1.text = ""
                        AnswerView2.text = ""
                            AnswerView3.text = ""
            AnswerView1.isClickable = false
                AnswerView2.isClickable = false
                    AnswerView3.isClickable = false
        }
        AnswerView2.setOnClickListener {
                QuestionView.text = "Увы... Ответ не верный. Правильный ответ:  ${answers[nowAnswer - 3]}"
                    AnswerView1.text = ""
                        AnswerView2.text = ""
                            AnswerView3.text = ""
            AnswerView1.isClickable = false
                AnswerView2.isClickable = false
                    AnswerView3.isClickable = false
        }
        AnswerView3.setOnClickListener {
                QuestionView.text = "Увы... Ответ не верный. Правильный ответ:  ${answers[nowAnswer - 3]}"
                    AnswerView1.text = ""
                        AnswerView2.text = ""
                            AnswerView3.text = ""
            AnswerView1.isClickable = false
                AnswerView2.isClickable = false
                    AnswerView3.isClickable = false
        }
    }
    //По идее можно сделать рандом нужно просто игратся с числами а точнее с индексами
    @SuppressLint("SetTextI18n")
    fun next () {
        buttonNext.setOnClickListener {
            while (questions[nowQuestion] != "0") { //добавляем в массив вопросов 0 и все останавливается
                AnswerView1.isClickable = true
                    AnswerView2.isClickable = true
                        AnswerView3.isClickable = true
                QuestionView.text = questions[nowQuestion]
                    nowQuestion++
                AnswerView1.text = answers[nowAnswer]
                    nowAnswer++
                AnswerView2.text = answers[nowAnswer]
                    nowAnswer++
                AnswerView3.text = answers[nowAnswer]
                    nowAnswer++

                AnswerView1.setOnClickListener {
                    QuestionView.text = "Отлично. Ответ верный."
                        AnswerView1.text = ""
                            AnswerView2.text = ""
                                AnswerView3.text = ""
                    AnswerView1.isClickable = false
                        AnswerView2.isClickable = false
                            AnswerView3.isClickable = false
                }
                AnswerView2.setOnClickListener {
                    QuestionView.text = "Увы... Ответ не верный. Правильный ответ:  ${answers[nowAnswer -3]}"
                        AnswerView1.text = ""
                            AnswerView2.text = ""
                                AnswerView3.text = ""
                    AnswerView1.isClickable = false
                        AnswerView2.isClickable = false
                            AnswerView3.isClickable = false
                }
                AnswerView3.setOnClickListener {
                    QuestionView.text = "Увы... Ответ не верный. Правильный ответ:  ${answers[nowAnswer - 3]}"
                        AnswerView1.text = ""
                            AnswerView2.text = ""
                                AnswerView3.text = ""
                    AnswerView1.isClickable = false
                        AnswerView2.isClickable = false
                            AnswerView3.isClickable = false
                }
            }
        }
    }
}