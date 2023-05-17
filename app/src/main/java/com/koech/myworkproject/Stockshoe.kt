package com.koech.myworkproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Stockshoe : AppCompatActivity() {
    lateinit var btnpayement:Button
    lateinit var btnshoe:Button
    lateinit var btnshoeprice:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stockshoe)
        btnpayement=findViewById(R.id.btn_payement)
        btnshoe=findViewById(R.id.btn_airforceshoes)
        btnshoeprice=findViewById(R.id.btn_jordanshoes)
        btnshoe.setOnClickListener {
            val intent=Intent(this,PayActivity::class.java)
            startActivity(intent)
            btnshoeprice.setOnClickListener {
                val intent=Intent(this,PayActivity::class.java)
                startActivity(intent)
            }
        }
     btnpayement.setOnClickListener {
         val intent=Intent(this,PayActivity::class.java)
         startActivity(intent)
     }

    }
}