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
    val q: Array<String> = Array(1){ "" }
    val a: Array<Array<String>> = Array(15)
    {
        Array(3)
        {
            ""
        }
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training)

        buttonNext.setOnClickListener {}

        buttonRestart.isClickable = false
        buttonRestart.isEnabled = false

        q[0] = "2 + 2 * 2"
        a[0] = arrayOf("6","8","4")

        questionField.text = resources.getString(R.string.Hello)
        buttonNext.text = resources.getString(R.string.Understand)

        buttonNext.setOnClickListener {
            questionField.text = resources.getString(R.string.Show)
            buttonNext.text = resources.getString(R.string.Good)
                buttonNext.setOnClickListener {
                    questionField.text = resources.getString(R.string.Question)
                        answerField1.text = resources.getString(R.string.Variant1)
                            answerField2.text = resources.getString(R.string.Variant2)
                                answerField3.text = resources.getString(R.string.Variant3)
                                    buttonNext.text = resources.getString(R.string.Understand2)
                    buttonNext.setOnClickListener {
                        questionField.text = resources.getString(R.string.Lets_ask_one_question)
                            answerField1.text = ""
                                answerField2.text = ""
                                    answerField3.text = ""
                                        buttonNext.text = resources.getString(R.string.Lets_go)
                        buttonNext.setOnClickListener {
                            main2(buttonNext, questionField, answerField1, answerField2, answerField3, q,a)
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
    private fun main2(buttonNext: TextView,
                      questionField: TextView,
                      answerField1: TextView,
                      answerField2: TextView,
                      answerField3: TextView,
                      questions: Array<String>,
                      answers: Array<Array<String>>) {

        questionField.text = questions[counter]
        answerField1.text = answers[counter][0]
        answerField2.text = answers[counter][1]
        answerField3.text = answers[counter][2]
        answerField1.isClickable = true
        answerField2.isClickable = true
        answerField3.isClickable = true
        answerField1.setOnClickListener {
            questionField.text = resources.getString(R.string.True)
            answerField1.text = ""
            answerField2.text = ""
            answerField3.text = ""
            answerField1.isClickable = false
            answerField2.isClickable = false
            answerField3.isClickable = false
            buttonNext.setOnClickListener {
                val intent = Intent(this, StartActivity::class.java)
                startActivity(intent)
            }
        }
        answerField2.setOnClickListener {
            questionField.text = resources.getString(R.string.False)
            answerField1.text = ""
            answerField2.text = ""
            answerField3.text = ""
            answerField1.isClickable = false
            answerField2.isClickable = false
            answerField3.isClickable = false

            buttonRestart.isClickable = true
            buttonRestart.isEnabled = true

            buttonRestart.setOnClickListener {
                main2(buttonNext, questionField, answerField1, answerField2, answerField3, q,a)
            }
            buttonNext.setOnClickListener {
                val intent = Intent(this, StartActivity::class.java)
                startActivity(intent)
            }
        }
        answerField3.setOnClickListener {
            questionField.text = resources.getString(R.string.False)
            answerField1.text = ""
            answerField2.text = ""
            answerField3.text = ""
            answerField1.isClickable = false
            answerField2.isClickable = false
            answerField3.isClickable = false

            buttonRestart.isClickable = true
            buttonRestart.isEnabled = true

            buttonRestart.setOnClickListener {
                main2(buttonNext, questionField, answerField1, answerField2, answerField3, q,a)
            }
            buttonNext.setOnClickListener {
                val intent = Intent(this, StartActivity::class.java)
                startActivity(intent)
            }
        }
    }
}