package com.dmitry.searchgame

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class Choose_Test : ListActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_test)
            val array: Array<String> = arrayOf("Search Game")
                val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array)
                    listAdapter = adapter
    }

    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)
        if (position == 0){
            val i = Intent(this, SearchGameTest::class.java)
            startActivity(i)
        }
    }
}