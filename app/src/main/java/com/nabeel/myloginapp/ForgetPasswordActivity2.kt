package com.nabeel.myloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgetPasswordActivity2 : AppCompatActivity() {
    lateinit var Sign: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password2)
        Sign = findViewById(R.id.Sign)
        Sign.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("name", "Nabeel")
            startActivity(intent)
        }
    }

    }