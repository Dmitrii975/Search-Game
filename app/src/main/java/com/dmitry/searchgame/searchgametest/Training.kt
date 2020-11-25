package com.dmitry.searchgame.searchgametest

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dmitry.searchgame.R
import kotlinx.android.synthetic.main.activity_training.*


class Training : AppCompatActivity() {
    private val context: Context = this
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training)
        QuestionField.text = "Приветствую тебя в Search Game! В этой игре тебе " +
                "предстоит проходить тесты на разные темы. Надеюсь тебе понравится)"
        ButtonNext.text = "Понятно"

        ButtonNext.setOnClickListener {
            QuestionField.text = "Ок, сейчас покажу тебе небольшую схему что и где."
            ButtonNext.text = "Ок"
                ButtonNext.setOnClickListener {
                    QuestionField.text = "Вопрос"
                        AnswerField1.text = "Вариант ответа 1"
                            AnswerField2.text = "Вариант ответа 2"
                                AnswerField3.text = "Вариант ответа 3"
                                    ButtonNext.text = "Уяснил(а)"
                    ButtonNext.setOnClickListener {
                        QuestionField.text = "Теперь ты все знаешь давай-ка ответим на один вопрос."
                            AnswerField1.text = ""
                                AnswerField2.text = ""
                                    AnswerField3.text = ""
                                        ButtonNext.text = "Давай"
                        ButtonNext.setOnClickListener {
                            val q = ArrayList<String>()
                                q.add("2 + 2 * 2")
                            val a = ArrayList<String>()
                                a.add("4")
                                    a.add("8")
                                        a.add("6")
                                            a.add("0")
//                            val c = MainClass(ButtonNext, QuestionField, AnswerField1, AnswerField2, AnswerField3, q, a, context)
//                            c.main()
                        }
                    }
                }
        }
    }
}