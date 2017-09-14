package com.example.groot.kotlinproject.presentation.presenters

import com.example.groot.kotlinproject.domain.usecases.LoginUseCase

/**PRUEBA
 * Created by groot on 9/13/17.
 */
class MainPresenter(val view: View) {

    private val useCase=LoginUseCase()

    fun login(user: String, pswd: String) {

        useCase.login(user = user, psswd = pswd){
            if(it){
                view.showMessage("Login Correcto")
                view.onLoginSucess()
            }else{
                view.showMessage("Login Incorrecto")
            }
        }

    }

    interface View {

        fun showMessage(message: String)

        fun onLoginSucess()

    }
}