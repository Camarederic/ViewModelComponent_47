package com.example.viewmodelcomponent_47

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        object : CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
               textView.text = (millisUntilFinished/1000).toString()
            }

            override fun onFinish() {

            }

        }.start()
    }
}