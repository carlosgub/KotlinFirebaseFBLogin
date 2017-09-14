package com.example.groot.kotlinproject.domain.usecases

/**
 * Created by groot on 9/13/17.
 */
class LoginUseCase {

    fun login(user: String, pswd: String = "123",psswd:String, cb : (Boolean) -> Unit) {
        cb(user=="carlos" && psswd=="123")
    }
}