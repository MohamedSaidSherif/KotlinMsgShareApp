package com.yelloco.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity_main_hobbies_share_button.setOnClickListener {

            var intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}