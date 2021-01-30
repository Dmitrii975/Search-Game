package com.dmitry.searchgame.searchgametest

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dmitry.searchgame.R
import kotlinx.android.synthetic.main.activity_training.*


class Training : AppCompatActivity() {
    private val context: Context = this
    private val q: Array<String> = Array(1){ "" }
    private val a: Array<Array<String>> = Array(15)
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

        buttonRestart.visibility = View.INVISIBLE
        buttonRestart.isClickable = false

        buttonNext.setOnClickListener {}



        val question = Question( "2 + 2 * 2","6","8","4")
        val array = arrayOf(question)
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
                            buttonRestart.setOnClickListener {
                                buttonNext.text = resources.getString(R.string.next)
                                val main2 = MainClass(array,buttonNext, questionField, answerField1, answerField2, answerField3, buttonRestart,context, true)
                                        main2.main(isEnd = false)
                                buttonRestart.visibility = View.INVISIBLE
                                    buttonRestart.isClickable = false
                            }
                            buttonNext.text = resources.getString(R.string.next)
                            val main = MainClass(array, buttonNext, questionField, answerField1, answerField2, answerField3, buttonRestart, context, true)
                                    main.main(isEnd = false)
                        }
                    }
             }   }
        }
    }
