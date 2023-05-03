package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    lateinit var TVlogin: TextView
    lateinit var tilFirstName: TextInputLayout
    lateinit var tilLastName:TextInputLayout
    lateinit var tilEmail: TextInputLayout
    lateinit var tilPassword:TextInputLayout
    lateinit var tilConfirmPassword: TextInputLayout
    lateinit var etFirstName: TextInputEditText
    lateinit var etLastName: TextInputEditText
    lateinit var etEmail: TextInputEditText
    lateinit var etPassword: TextInputEditText
    lateinit var etConfirmPasword: TextInputEditText
    lateinit var btnSignup: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()


    }

    override fun onResume() {
        super.onResume()
        TVlogin.setOnClickListener {
            val intent = Intent(this,LOGIN2::class.java)
            startActivity(intent)
        }
        btnSignup.setOnClickListener {
            validateSignUp()
        }
    }
    fun castViews(){
        TVlogin =findViewById(R.id.TVlogin)
        tilFirstName =findViewById(R.id.tilFirstName)
        tilLastName =findViewById(R.id.tilLastName)
        tilEmail = findViewById(R.id.tilEmail)
        tilPassword=findViewById(R.id.tilPassword)
        tilConfirmPassword =findViewById(R.id.tilConfirmPassword)
        btnSignup = findViewById(R.id.btnSignup)
        etFirstName = findViewById(R.id.etFirstName)
        etLastName = findViewById(R.id.etLastName)
        etEmail = findViewById(R.id.etEmail)
        etPassword =findViewById(R.id.etPasword)
        etConfirmPasword = findViewById(R.id.etConfirmPasword)
        btnSignup =findViewById(R.id.btnSignup)


    }
    fun validateSignUp(){
        val firstName = etFirstName.text.toString()
        val lastName = etLastName.text.toString()
        val email = etEmail.text.toString()
        val password = etPassword.text.toString()
        val passwordConfirmation = etConfirmPasword.text.toString()
        var error = false
        if (lastName.isBlank()){
            tilLastName.error = "Last name is required"
            error= true
        }

        if (email.isBlank()){
          tilEmail.error = "Email is required"
            error= true
        }
        if (password.isBlank()){
            tilPassword.error = "Password is required"
            error= true
        }
        if (passwordConfirmation.isBlank()){
            tilConfirmPassword.error = "Password confirmation is required"
            error= true
        }
        if (password!=passwordConfirmation){
            tilConfirmPassword.error = "Password does not match"
            error= true
        }
        if(!error)
            Toast
                .makeText(this, "$firstName $lastName $email",Toast.LENGTH_LONG)
                .show()
    }

}