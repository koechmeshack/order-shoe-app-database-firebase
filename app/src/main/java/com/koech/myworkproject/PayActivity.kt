package com.koech.myworkproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PayActivity : AppCompatActivity() {
    lateinit var txtshoetype: TextView
    lateinit var txtshoeamount: TextView
    lateinit var buttonmpesa: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)
        txtshoetype = findViewById(R.id.txt_shoetype)
        txtshoeamount = findViewById(R.id.txt_shoeprice)
        buttonmpesa = findViewById(R.id.btn_mpesa)
        buttonmpesa.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }


        }
    }
}