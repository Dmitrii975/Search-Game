package com.dmitry.searchgame.searchgametest

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import android.content.SharedPreferences
import com.dmitry.searchgame.R

class MainClass
{
    private var counter = 0
    private val array: Array<String> = Array<String>(3){ "" }

    @SuppressLint("SetTextI18n")
    fun main(buttonNext: TextView,
             questionField: TextView,
             answerField1: TextView,
             answerField2: TextView,
             answerField3: TextView,
             questions: Array<String>,
             answers: Array<Array<String>>,
             context: Context,
            isEnd: Boolean) {

            buttonNext.setOnClickListener {  }
            if (isEnd){
                val i = Intent(context, SearchGameFinish::class.java)
                    val b: Bundle? = i.extras
                        startActivity(context, i, b)
                return
            }
            array[0] = answers[counter][0]
            array[1] = answers[counter][1]
            array[2] = answers[counter][2]

            for (i in 0..2){
                val rand1 = (0 until 3).random()
                val rand2 = (0 until 3).random()
                array[rand1] = array[rand2].also{ array[rand2] = array[rand1]}
            }

            questionField.text = questions[counter]
            answerField1.text = array[0]
            answerField2.text = array[1]
            answerField3.text = array[2]
            answerField1.isClickable = true
            answerField2.isClickable = true
            answerField3.isClickable = true

            when (getField(array, answers)){
                1 -> {
                    answerField1.setOnClickListener {
                    questionField.text = context.resources.getString(R.string.True)
                    answerField1.text = ""
                    answerField2.text = ""
                    answerField3.text = ""
                    answerField1.isClickable = false
                    answerField2.isClickable = false
                    answerField3.isClickable = false
                        buttonNext.setOnClickListener {
                            counter++
                            if (counter == questions.size)
                                main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, true)
                            else
                                main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, false)
                        }
            }
                answerField2.setOnClickListener {
                    questionField.text = context.resources.getString(R.string.False)
                    answerField1.text = ""
                    answerField2.text = ""
                    answerField3.text = ""
                    answerField1.isClickable = false
                    answerField2.isClickable = false
                    answerField3.isClickable = false
                    buttonNext.setOnClickListener {
                        counter++
                        if (counter == questions.size)
                            main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, true)
                        else
                            main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, false)
                    }
            }
                answerField3.setOnClickListener {
                    questionField.text = context.resources.getString(R.string.False)
                    answerField1.text = ""
                    answerField2.text = ""
                    answerField3.text = ""
                    answerField1.isClickable = false
                    answerField2.isClickable = false
                    answerField3.isClickable = false
                    buttonNext.setOnClickListener {
                        counter++
                        if (counter == questions.size)
                            main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, true)
                        else
                            main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, false)
                    }
            }
                }
                2 -> {
                    answerField2.setOnClickListener {
                        questionField.text = context.resources.getString(R.string.True)
                        answerField1.text = ""
                        answerField2.text = ""
                        answerField3.text = ""
                        answerField1.isClickable = false
                        answerField2.isClickable = false
                        answerField3.isClickable = false
                        buttonNext.setOnClickListener {
                            counter++
                            if (counter == questions.size)
                                main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, true)
                            else
                                main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, false)
                        }
                    }
                    answerField1.setOnClickListener {
                        questionField.text = context.resources.getString(R.string.False)
                        answerField1.text = ""
                        answerField2.text = ""
                        answerField3.text = ""
                        answerField1.isClickable = false
                        answerField2.isClickable = false
                        answerField3.isClickable = false
                        buttonNext.setOnClickListener {
                            counter++
                            if (counter == questions.size)
                                main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, true)
                            else
                                main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, false)
                        }
                    }
                    answerField3.setOnClickListener {
                        questionField.text = context.resources.getString(R.string.False)
                        answerField1.text = ""
                        answerField2.text = ""
                        answerField3.text = ""
                        answerField1.isClickable = false
                        answerField2.isClickable = false
                        answerField3.isClickable = false
                        buttonNext.setOnClickListener {
                            counter++
                            if (counter == questions.size)
                                main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, true)
                            else
                                main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, false)
                        }
                    }
                }
                3 -> {
                    answerField3.setOnClickListener {
                        questionField.text = context.resources.getString(R.string.True)
                        answerField1.text = ""
                        answerField2.text = ""
                        answerField3.text = ""
                        answerField1.isClickable = false
                        answerField2.isClickable = false
                        answerField3.isClickable = false
                        buttonNext.setOnClickListener {
                            counter++
                            if (counter == questions.size)
                                main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, true)
                            else
                                main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, false)
                        }
                    }
                    answerField2.setOnClickListener {
                        questionField.text = context.resources.getString(R.string.False)
                        answerField1.text = ""
                        answerField2.text = ""
                        answerField3.text = ""
                        answerField1.isClickable = false
                        answerField2.isClickable = false
                        answerField3.isClickable = false
                            buttonNext.setOnClickListener {
                                counter++
                                if (counter == questions.size)
                                    main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, true)
                                else
                                    main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, false)
                            }
                    }
                    answerField1.setOnClickListener {
                        questionField.text = context.resources.getString(R.string.False)
                        answerField1.text = ""
                        answerField2.text = ""
                        answerField3.text = ""
                        answerField1.isClickable = false
                        answerField2.isClickable = false
                        answerField3.isClickable = false
                        buttonNext.setOnClickListener {
                            counter++
                            if (counter == questions.size)
                                main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, true)
                            else
                                main( buttonNext, questionField, answerField1, answerField2, answerField3, questions, answers, context, false)
                        }
                    }
                }
            }

    }
    private fun getField(q1: Array<String>, q2: Array<Array<String>>): Int {
        return when {
            q1[0] == q2[counter][0] -> {
                1
            }
            q1[1] == q2[counter][0] -> {
                2
            }
            q1[2] == q2[counter][0] -> {
                3
            }
            else -> 0
        }
    }
}