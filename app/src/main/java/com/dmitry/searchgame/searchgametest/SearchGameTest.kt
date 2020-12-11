package com.dmitry.searchgame.searchgametest

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dmitry.searchgame.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.reward.RewardedVideoAd
import com.google.android.gms.ads.reward.RewardedVideoAdListener
import kotlinx.android.synthetic.main.search_game_test.*


class SearchGameTest : AppCompatActivity(), RewardedVideoAdListener {
    private lateinit var mRewardedVideoAd: RewardedVideoAd
    private val context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_game_test)
        val answer: Array<Array<String>> = Array(15)
        {
            Array(3)
            {
                ""
            }
        }
        answer[0] = arrayOf("Яндекс - это Российская компания, зарегистрированная в Нидерландах.", "Яндекс — это Американская компания, зарегистрированная там же.",
            "Яндекс — это компания, зарегистрированная в Москве.")
        answer[1] = arrayOf("6.3 миллиардов в месяц (дата: начало 2014).", "6 миллиардов в месяц (дата: начало 2014).",
            "6.4 миллиардов в месяц (дата: начало 2014).")
        answer[2] = arrayOf("Первое место в России.", "Второе место в России.", "Яндекс — это не Российская компания.")
        answer[3] = arrayOf("Улица Льва Толстого, дом 16.", "Улица Геймерская, дом 7.", "Улица Лесная, дома 22.")
        answer[4] = arrayOf("Да, например, Яндекс устраивает множество семинаров и разных олимпиад и чемпионатов.", "Что такое образование?",
            "Нет, не имеет.")
        answer[5] = arrayOf("В 1996 году.", "В 1998 году.", "В 1994 году.")
        answer[6] = arrayOf("Google Inc.", "Yandex.", "Apple Inc.")
        answer[7] = arrayOf("Да, и уже давно.", "Нет.", "А что такое голосовой поиск?")
        answer[8] = arrayOf("Да и он многое может.", "Нет, ну и так и надо чтобы дети сами считали а не на калькуляторе.",
            "А что вообще такое калькулятор я просто немного подеградировал.")
        answer[9] = arrayOf("В 2009 году.", "В 2020 году.", "В 2000 году.")
        answer[10] = arrayOf("macOS и IOS.", "Windows.", "Linux.")
        answer[11] = arrayOf("Потому что договор с Microsoft а точнее на использование Internet Explorer закончился", "Потому что просто не на что было деньги тратить.",
            "Потому что им захотелось обзавестись собственным браузером.")
        answer[12] = arrayOf("Да имеет и это очень полезная вещь.", "Нет не имеет", "Я пользуюсь Chrome и мне нормально")
        answer[13] = arrayOf("Да, имеет и я ей активно пользуюсь.", "Нет или не знаю.", "Да, только я ей не пользуюсь.")
        answer[14] = arrayOf("Да очень полезная вещь.", "Нет а что это.", "А что такое режим чтения?")


        val question: Array<String> = arrayOf("Где зарегистрирована компания Яндекс?",
        "Сколько запросов обрабатывается в месяц?",
        "Какое место из всех поисковых систем в России занимает Яндекс?",
        "Где располагается главный офис Яндекс в Москве?",
        "Имеет ли компания Яндекс отношение к образованию.",
        "В каком году был основана поискова система Google?",
        "Кто владеет поисковой системой Google?",
        "Имеет ли Google возможность голосового поиска?",
        "Имеет ли Google встроенный калькулятор?",
        "В каком году был запущен сервиз Википоиск? (он уже закрыт)",
        "В состав каких ОП входит Safari?",
        "Почему был создан Safari?",
        "Имеет ли Safari блокиратор всплывающих окон?",
        "Имеет ли Safari функцию поиска текста на странице?",
        "Имеет ли Safari режим чтения?")

        val clazz = MainClass()
            clazz.main( buttonNext,
                questionField,
                answerField1,
                answerField2,
                answerField3,
                question,
                answer,
                context,
                false)
    }
    private fun loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd(
            "ca-app-pub-3940256099942544/5224354917",
            AdRequest.Builder().build()
        )
    }

    override fun onRewarded(p0: com.google.android.gms.ads.reward.RewardItem?) {
        Toast.makeText(this, "Все в поряде", Toast.LENGTH_SHORT).show()
    }

    override fun onRewardedVideoAdLeftApplication() {
        Toast.makeText(this, "onRewardedVideoAdLeftApplication", Toast.LENGTH_SHORT).show()
    }

    override fun onRewardedVideoAdClosed() {
        Toast.makeText(this, "onRewardedVideoAdClosed", Toast.LENGTH_SHORT).show()
    }

    override fun onRewardedVideoAdFailedToLoad(errorCode: Int) {
        Toast.makeText(this, "onRewardedVideoAdFailedToLoad", Toast.LENGTH_SHORT).show()
    }

    override fun onRewardedVideoAdLoaded() {
        Toast.makeText(this, "onRewardedVideoAdLoaded", Toast.LENGTH_SHORT).show()
    }

    override fun onRewardedVideoAdOpened() {
        Toast.makeText(this, "onRewardedVideoAdOpened", Toast.LENGTH_SHORT).show()
    }

    override fun onRewardedVideoStarted() {
        Toast.makeText(this, "onRewardedVideoStarted", Toast.LENGTH_SHORT).show()
    }

    override fun onRewardedVideoCompleted() {
        Toast.makeText(this, "onRewardedVideoCompleted", Toast.LENGTH_SHORT).show()
    }
}