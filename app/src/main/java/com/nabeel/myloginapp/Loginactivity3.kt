package com.nabeel.myloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class Loginactivity3 : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etLastName: EditText
    lateinit var etPhone: EditText
    lateinit var etAge: EditText
    lateinit var etCity: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity3)

        etName = findViewById(R.id.etName)
        etLastName = findViewById(R.id.etLastName)
        etPhone = findViewById(R.id.etPhone)
        etAge = findViewById(R.id.etAge)
        etCity = findViewById(R.id.etCity)

        intent?.let {
            etName.setText(it.getStringExtra("name"))?:""
            etLastName.setText(it.getStringExtra("lastName"))?:""
        }



    }
}