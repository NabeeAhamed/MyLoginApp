package com.nabeel.myloginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.core.widget.doOnTextChanged

class LoginActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etLastName: EditText
    lateinit var etPhone: EditText
    lateinit var etAge: EditText
    lateinit var etCity: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        etName = findViewById(R.id.etName)
        etLastName =findViewById(R.id.etLastName)
        etAge = findViewById(R.id.etAge)
        etCity = findViewById(R.id.etCity)
        etPhone = findViewById(R.id.etPhone)

        intent?.let{
            var name = it.getStringExtra("name") as String
        }
        etName.doOnTextChanged { text, _, _, _ ->
            if ((text?.length ?: 0) < 10) {
                etName.error = resources.getString(R.string.enter_a_valid_name)

        }
            etLastName.doOnTextChanged { text, _, _, _ ->
                if ((text?.length ?: 0) < 10) {
                    etLastName.error = resources.getString(R.string.enter_a_valid_Last_Name)
                    etAge.doOnTextChanged { text, _, _, _ ->
                        if ((text?.length ?: 0) < 10) {
                            etAge.error = resources.getString(R.string.enter_a_valid_Age)
                            etCity.doOnTextChanged { text, _, _, _ ->
                                if ((text?.length ?: 0) < 10) {
                                    etCity.error = resources.getString(R.string.enter_a_valid_City)
                                    etPhone.doOnTextChanged { number, _, _, _ ->
                                        if ((text?.length ?: 0) < 10) {
                                            etPhone.error = resources.getString(R.string.enter_a_valid_Phone)

                                        }
    }
}}