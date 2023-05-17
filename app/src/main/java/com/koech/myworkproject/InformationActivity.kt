package com.koech.myworkproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InformationActivity : AppCompatActivity() {
    lateinit var btndial:Button
    lateinit var txtinformation:TextView
    lateinit var btngoback:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)
        btndial=findViewById(R.id.btn_textme)
        txtinformation=findViewById(R.id.txt_information)
        btngoback=findViewById(R.id.btn_goback)

        btngoback.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            btndial.setOnClickListener {
                val phone = "+254721636533"

                val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

                startActivity(intent)
            }
        }
        

        }
    }
