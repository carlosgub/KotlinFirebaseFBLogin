package com.example.groot.kotlinproject.presentation.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.groot.kotlinproject.R
import com.example.groot.kotlinproject.presentation.presenters.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity(), MainPresenter.View {

    var presenter: MainPresenter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter= MainPresenter(this)

        logIn.setOnClickListener { presenter?.login(user.text.toString(),pswd.text.toString())}

    }

    override fun showMessage(message: String) {
        //Toast.makeText(this,message,Toast.LENGTH_LONG).show()
        toast(message)
    }

    override fun onLoginSucess() {
        startActivity<UserInformationActivity>(
                "user" to user.text.toString(),
                "pswd" to pswd.text.toString())
    }
}
