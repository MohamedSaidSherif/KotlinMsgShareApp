package com.yelloco.msgshareapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yelloco.msgshareapp.Constants
import com.yelloco.msgshareapp.R
import com.yelloco.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object{
        val TAG: String = SecondActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        bundle?.let {
            val msg = bundle.getString(Constants.USER_MSG_KEY)
            msg?.let {
                showToast(msg)
                txvUserMessage.text = msg
            }
        }
    }
}