package com.koech.myworkproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class IndexActivity : AppCompatActivity() {
    lateinit var img_click:ImageView
    lateinit var img_10:ImageView
    lateinit var imgv_11:ImageView
    lateinit var imgv_12:ImageView
    lateinit var txt_welcome:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)
        img_click=findViewById(R.id.img_click)
        img_10=findViewById(R.id.img_10)
        imgv_11=findViewById(R.id.img_11)
        imgv_12=findViewById(R.id.img_12)
        txt_welcome=findViewById(R.id.txt_welcome)

        img_click.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}