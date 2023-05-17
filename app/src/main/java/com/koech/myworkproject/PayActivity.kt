package com.koech.myworkproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PayActivity : AppCompatActivity() {
    lateinit var txtshoetype: TextView

       lateinit var buttonmpesa: Button
    lateinit var btnorder:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)
        txtshoetype = findViewById(R.id.edt_shoetype)
        buttonmpesa = findViewById(R.id.btn_mpesa)
        btnorder.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        buttonmpesa.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }


        }
    }
}