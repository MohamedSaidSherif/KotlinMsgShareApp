package com.yelloco.msgshareapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yelloco.msgshareapp.Constants
import com.yelloco.msgshareapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity_main_send_data_to_second_activity_button.setOnClickListener {
            val message: String = activity_main_message_edit_text.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Constants.USER_MSG_KEY, message)
            startActivity(intent)
        }

        activity_main_hobbies_share_button.setOnClickListener {
            var intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}