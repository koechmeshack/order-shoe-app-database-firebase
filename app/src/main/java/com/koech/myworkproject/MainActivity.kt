package com.koech.myworkproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    lateinit var edtpassword: EditText
    lateinit var confirmpass:EditText
    lateinit var edtemailaddress: EditText
    lateinit var btngotowelcome: Button
    lateinit var btnssigned: Button
    lateinit var txtlogin: TextView
    private lateinit var auth: FirebaseAuth
    lateinit var EdtEmail:EditText
    lateinit var EdtPass:EditText
    lateinit var EdtConPaa:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EdtPass = findViewById(R.id.edt_password)
        EdtEmail = findViewById(R.id.edt_emailaddress)
        btngotowelcome = findViewById(R.id.btn_gotowelcome)
        btnssigned = findViewById(R.id.btnSSigned)
        txtlogin = findViewById(R.id.tvRedirectLogin)
        EdtConPaa =findViewById(R.id.edt_confirmpass)

        txtlogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        btngotowelcome.setOnClickListener {
            val intent = Intent(this, InformationActivity::class.java)
            startActivity(intent)
        }
        auth = Firebase.auth
        btnssigned.setOnClickListener {
            SignUpUser()
        }
    }
           private fun SignUpUser() {
                val email = EdtEmail.text.toString()
                val pass = EdtPass.text.toString()
                val confirmpass = EdtConPaa.text.toString()
                if (email.isBlank() || pass.isBlank() || confirmpass.isBlank()) {
                    Toast.makeText(this, "Please Email and password cant be blank", Toast.LENGTH_LONG).show()
                    return
                } else if (pass != confirmpass) {
                    Toast.makeText(this, "Password do not match", Toast.LENGTH_LONG).show()
                    return

                }
                auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
                    if (it.isSuccessful) {
                       val intent=Intent(this,LoginActivity::class.java)
                        startActivity(intent)
                        Toast.makeText(this, "Signed successfully", Toast.LENGTH_LONG).show()
                        finish()
                    } else {
                        Toast.makeText(this, "Failed to create", Toast.LENGTH_LONG).show()
                    }


                }
            }


}










