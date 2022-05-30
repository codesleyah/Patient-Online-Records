package com.expert.patientrecords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Login : AppCompatActivity() {

    //variable declarations
    lateinit var btnLogin : androidx.appcompat.widget.AppCompatButton
    lateinit var etPassword : EditText
    lateinit var  etUserName : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //variable initialization
        btnLogin = findViewById(R.id.btnLogin)
        etPassword = findViewById(R.id.etPassword)
        etUserName = findViewById(R.id.etUserName)


        //onclick event for the login button
        btnLogin.setOnClickListener(View.OnClickListener {
            logIn()
        })
    }

    private fun logIn() {
       val intent  = Intent(this, Home::class.java)
        startActivity(intent)
    }
}