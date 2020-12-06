package com.dmitry.searchgame.searchgametest

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.dmitry.searchgame.R
import kotlinx.android.synthetic.main.activity_training.*


class Training : AppCompatActivity() {
    private val context: Context = this
    private var counter = 0
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training)
        questionField.text = "Приветствую тебя в Search Game! В этой игре тебе " +
                "предстоит проходить тесты на разные темы. Надеюсь тебе понравится)"
        buttonNext.text = "Понятно"

        buttonNext.setOnClickListener {
            questionField.text = "Ок, сейчас покажу тебе небольшую схему что и где."
            buttonNext.text = "Ок"
                buttonNext.setOnClickListener {
                    questionField.text = "Вопрос"
                        answerField1.text = "Вариант ответа 1"
                            answerField2.text = "Вариант ответа 2"
                                answerField3.text = "Вариант ответа 3"
                                    buttonNext.text = "Уяснил(а)"
                    buttonNext.setOnClickListener {
                        questionField.text = "Теперь ты все знаешь давай-ка ответим на один вопрос."
                            answerField1.text = ""
                                answerField2.text = ""
                                    answerField3.text = ""
                                        buttonNext.text = "Давай"
                        buttonNext.setOnClickListener {
                            val q: Array<String> = Array(1){ "" }
                            q[0] = "2 + 2 * 2"
                            val a: Array<Array<String>> = Array(15)
                            {
                                Array(3)
                                {
                                    ""
                                }
                            }
                            a[0] = arrayOf("6","8","4")
                            main2(buttonNext, questionField, answerField1, answerField2, answerField3, q,a,context, false)
//                            buttonNext.setOnClickListener {
//                                questionField.text = "Обучение пройдено"
//                                answerField1.text = ""
//                                answerField2.text = ""
//                                answerField3.text = ""
//                                answerField1.isClickable = false
//                                answerField2.isClickable = false
//                                answerField3.isClickable = false
//                            }
                        }
                    }
                }
        }
    }
    fun main2(buttonNext: TextView,
             questionField: TextView,
             answerField1: TextView,
             answerField2: TextView,
             answerField3: TextView,
             questions: Array<String>,
             answers: Array<Array<String>>,
             context: Context,
             isEnd: Boolean) {

        if (isEnd) {
            val i = Intent(context, StartActivity::class.java)
            val b: Bundle? = i.extras
            ContextCompat.startActivity(context, i, b)
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
                main2(
                    buttonNext,
                    questionField,
                    answerField1,
                    answerField2,
                    answerField3,
                    questions,
                    answers,
                    context,
                    true
                )
            else
                main2(
                    buttonNext,
                    questionField,
                    answerField1,
                    answerField2,
                    answerField3,
                    questions,
                    answers,
                    context,
                    false
                )
        }
    }
}