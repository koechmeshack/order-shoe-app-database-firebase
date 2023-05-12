package com.koech.myworkproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var edtemailaddress:EditText
    lateinit var edtpassword:EditText
    lateinit var btngotologin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        edtemailaddress=findViewById(R.id.edt_emailaddress)
        edtpassword=findViewById(R.id.edt_password)
        btngotologin=findViewById(R.id.btn_gotologin)

        btngotologin.setOnClickListener {
            val intent=Intent(this,Stockshoe::class.java)
            startActivity(intent)
        }
    }
}