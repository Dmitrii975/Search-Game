package com.dmitry.searchgame.searchgametest

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.dmitry.searchgame.R

class Question(val question: String, val answer: String, val answer2:String, val answer3: String){
    val trueAnswer = answer
}

class MainClass(
    private val array: Array<Question>,
        private val buttonNext: TextView,
            private val questionField: TextView,
                private val answerField1: TextView,
                    private val answerField2: TextView,
                        private val answerField3: TextView,
                            private val buttonRestart: Button?,
                                private val context: Context,
                                    private val isTraining: Boolean)
{
    var trueAnswers: Int = 0
    private var counter = 0 // счетчик (по нему все контролим)
    private val mixedArray: Array<String> = Array(3){ "" } // массив под перемешанные вопросы

    @SuppressLint("SetTextI18n")
    fun main(isEnd: Boolean){ // главная функция
        buttonNext.setOnClickListener {} // обнуляем кликер
        if (isTraining) // если мы на обуении
            if (isEnd){ // проверяем конец ли
                questionField.text = context.resources.getString(R.string.Lets_go_to_main_activity)
                    answerField1.text = ""
                        answerField2.text = ""
                            answerField3.text = ""
                                buttonNext.text = context.resources.getString(R.string.Go_to)

                buttonNext.setOnClickListener { // если все вопросы закончились мы предлагаем перейти на главный экран и ставим обработик
                    // ------------ Магия ------------
                    val i = Intent(context, StartActivity::class.java)
                    val b: Bundle? = i.extras
                    ContextCompat.startActivity(context, i, b)
                }
                return
            }

            if (isEnd){ // если мы не в обучении и у нас конец массива вопросов/ответов
                questionField.text = context.resources.getString(R.string.FinishTextSearchGame) + context.resources.getString(R.string.HowManyTrueAnswer1) +
                        " $trueAnswers " + context.resources.getString(R.string.HowManyTrueAnswer2) + " 15 " + context.resources.getString(R.string.HowManyTrueAnswer3)
                answerField1.text = ""
                answerField2.text = ""
                answerField3.text = ""
                buttonNext.text = context.resources.getString(R.string.End)
                buttonNext.setOnClickListener {
                    val i = Intent(context, StartActivity::class.java)
                    val b: Bundle? = i.extras
                    ContextCompat.startActivity(context, i, b)
                }
                return
            }

            mixArrays() // мешаем вопросы и помещаем их в отдельный массив
                setText() // устанавливаем вопрос и ответы
                   setClickersForFields() // ставим обработики для полей с вариантами ответа
    }
    private fun setText(){
        questionField.text = array[counter].question
            answerField1.text = mixedArray[0]
                answerField2.text = mixedArray[1]
                    answerField3.text = mixedArray[2]
    } // установка текста
        private fun setClickersForFields(){
        when(getTrueField()){
            1 -> {
                answerField1.setOnClickListener { answerTrue(); setClickerForButtonNext() }
                    answerField2.setOnClickListener { answerFalse(); setClickerForButtonNext() }
                        answerField3.setOnClickListener { answerFalse(); setClickerForButtonNext() }
            }
            2 -> {
                answerField1.setOnClickListener { answerFalse(); setClickerForButtonNext() }
                    answerField2.setOnClickListener { answerTrue(); setClickerForButtonNext() }
                        answerField3.setOnClickListener { answerFalse(); setClickerForButtonNext() }
            }
            3 -> {
                answerField1.setOnClickListener { answerFalse(); setClickerForButtonNext() }
                    answerField2.setOnClickListener { answerFalse(); setClickerForButtonNext() }
                        answerField3.setOnClickListener { answerTrue(); setClickerForButtonNext() }
            }
        }
    } // устанавливаем OnClickListener
            private fun setClickerForButtonNext(){
        buttonNext.setOnClickListener {
            counter++
            if (counter == array.size)
                main(isEnd = true)
            else
                main(isEnd = false)

        }
    } // устанавливаем кликер для кнопки Next
                private fun mixArrays(){
        mixedArray[0] = array[counter].answer
        mixedArray[1] = array[counter].answer2
        mixedArray[2] = array[counter].answer3

        for (i in 0..2){
            val rand1 = (0 until 3).random()
            val rand2 = (0 until 3).random()
            mixedArray[rand1] = mixedArray[rand2].also{ mixedArray[rand2] = mixedArray[rand1]}
        }
    } // мешаем вопросы и в массив
                    private fun getTrueField(): Int{
        return when (array[counter].trueAnswer) {
            mixedArray[0] -> 1
                mixedArray[1] -> 2
                    mixedArray[2] -> 3
            else -> 0
        }
    } // давай погадаем где правильный ответ
                        private fun answerTrue(){
    trueAnswers++
        questionField.text = context.getString(R.string.True)
            answerField1.text = ""
                answerField2.text = ""
                    answerField3.text = ""
        answerField1.isClickable = false
            answerField2.isClickable = false
                answerField3.isClickable = false
    } // ответ верный
                            @SuppressLint("SetTextI18n")
                                private fun answerFalse(){
        if (isTraining) {
            questionField.text = "${context.getString(R.string.False)} ${array[counter].trueAnswer}"
                answerField1.text = ""
                    answerField2.text = ""
                        answerField3.text = ""
            answerField1.isClickable = false
                answerField2.isClickable = false
                    answerField3.isClickable = false
            buttonRestart?.visibility = View.VISIBLE
                buttonRestart?.isClickable = true

        }
        else{
            questionField.text = "${context.getString(R.string.False)} ${array[counter].trueAnswer}"
                answerField1.text = ""
                    answerField2.text = ""
                        answerField3.text = ""
            answerField1.isClickable = false
                answerField2.isClickable = false
                    answerField3.isClickable = false
        }
    } // ответ не верный
}