package com.koech.myworkproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edtpassword:EditText
    lateinit var edtname:EditText
    lateinit var edtemailaddress:EditText
    lateinit var btngotowelcome:Button
    lateinit var gotosignup:Button
    lateinit var gotologin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtpassword=findViewById(R.id.edt_password)
        edtname=findViewById(R.id.edt_name)
        edtemailaddress=findViewById(R.id.edt_emailaddress)
        btngotowelcome=findViewById(R.id.btn_gotowelcome)
        gotosignup=findViewById(R.id.btn_gosignup)
        gotologin=findViewById(R.id.btn_logintolog)
        btngotowelcome.setOnClickListener {
            val intent=Intent(this,InformationActivity::class.java)
            startActivity(intent)
         gotologin.setOnClickListener {
             val intent=Intent(this,LoginActivity::class.java)
             startActivity(intent)
             gotosignup.setOnClickListener {
                 val intent=Intent(this,LoginActivity::class.java)
                 startActivity(intent)
             }
         }
             }
         }
            }







