package com.nabeel.myloginapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.doOnTextChanged
import java.util.jar.Attributes

class LoginActivity : AppCompatActivity() {
    lateinit var btnOpen:Button
    lateinit var etName: EditText
    lateinit var etLastName: EditText
    lateinit var etPhone: EditText
    lateinit var etAge: EditText
    lateinit var etCity: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        btnOpen = findViewById(R.id.Open)
        etName = findViewById(R.id.etName)
        etLastName =findViewById(R.id.etLastName)
        etAge = findViewById(R.id.etAge)
        etCity = findViewById(R.id.etCity)
        etPhone = findViewById(R.id.etPhone)

        btnOpen.setOnClickListener {
            val Name = etName.text.toString()
            val LastName = etLastName.text.toString()
            val Age = etAge.text.toString()
            val City =etCity.text.toString()
            val Phone =etPhone.text.toString()


            if(Name.isNullOrBlank()){
                etName.error = resources.getString(R.string.enter_a_valid_name)
                etName.requestFocus()
            }else if(LastName.isNullOrEmpty()){
                etLastName.error = resources.getString(R.string.enter_a_valid_Last_Name)
                etLastName.requestFocus()
            }else  if(Age.isNullOrEmpty()) {
                etAge.error = resources.getString(R.string.enter_a_valid_Age)
                etAge.requestFocus()
            }else  if(City.isNullOrEmpty()) {
                etCity.error = resources.getString(R.string.enter_a_valid_City)
                etCity.requestFocus()
            }else if (Phone.isNullOrEmpty()) {
                etPhone.error = resources.getString(R.string.enter_a_valid_Phone)
                etPhone.requestFocus()
            }else{

            val intent = Intent(this@LoginActivity,Loginactivity3::class.java)
            intent.putExtra("name",Name)
            intent.putExtra("lastName",LastName)
            intent.putExtra("Phone",Integer.valueOf(etPhone.text.toString()))
           intent.putExtra("Age",Integer.valueOf(etAge.text.toString()))
           intent.putExtra("City",etCity.text.toString())
            startActivity(intent)}


        }


        etName.doOnTextChanged { text, _, _, _ ->
            if ((text?.length ?: 0) < 10) {
                etName.error = resources.getString(R.string.enter_a_valid_name)

        }
        }
            etLastName.doOnTextChanged { text, _, _, _ ->
                if ((text?.length ?: 0) < 10) {
                    etLastName.error = "Enter_valid_last_name"

                }}
                    etAge.doOnTextChanged { text, _, _, _ ->
                        if ((text?.length ?: 0) < 10) {
                            etAge.error = "Enter_a_valid_Age"

                        }}
                            etCity.doOnTextChanged { text, _, _, _ ->
                                if ((text?.length ?: 0) < 10) {
                                    etCity.error = "Enter_city_name"

                                }}
                                    etPhone.doOnTextChanged { text, _, _, _ ->
                                        if ((text?.length ?: 0) < 10) {
                                            etPhone.error = "Enter_a_valid_Phone"
                                        }
                                    }
        }}
