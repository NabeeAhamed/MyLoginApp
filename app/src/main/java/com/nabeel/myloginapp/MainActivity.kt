package com.nabeel.myloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.doOnTextChanged

class MainActivity() : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var etEmail: EditText
    lateinit var etPassword:EditText
    lateinit var btnForgetPassword: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etEmail = findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnForgetPassword =findViewById(R.id.ForgetPassword)
        etEmail.doOnTextChanged { text, start, before, count ->
            if((etEmail.text.toString()?.length?:0)<10){
                etEmail.error = resources.getString(R.string.enter_valid_email_here)
        }


       }

        etPassword.doOnTextChanged { text, start, before, count ->
            if((etEmail.text.toString().length ?:0)<10)
                etPassword.error = resources.getString(R.string.enter_valid_password)
        }

        btnForgetPassword.setOnClickListener  {
            var intent= Intent(this, ForgetPasswordActivity2::class.java).apply {
                startActivity(this)
            }

        btnLogin.setOnClickListener{
            var intent = Intent(this, LoginActivity::class.java).apply {
                startActivity(this)
            }
    }
    }
}}

