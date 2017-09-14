package com.example.groot.kotlinproject.presentation.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.groot.kotlinproject.R
import kotlinx.android.synthetic.main.activity_user_information.*

class UserInformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_information)

        val pswd = intent?.getStringExtra("pswd") ?: "null"
        val nameText= intent?.getStringExtra("user") ?: "null"
        pswdText.text = pswd
        name.text=nameText

    }
}
