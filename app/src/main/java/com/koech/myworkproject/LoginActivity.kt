package com.koech.myworkproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
//    lateinit var edtemailaddress:EditText
//    lateinit var edtpassword:EditText
    lateinit var btngotologin:Button
//    lateinit var tvredirectsignup:TextView
    lateinit var etEmail:EditText
    lateinit var etPass:EditText
    lateinit var btnsignup:Button
    lateinit var auth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etEmail= findViewById(R.id.edt_emailaddress)
        etPass = findViewById(R.id.edt_password)
        btngotologin = findViewById(R.id.btn_gotologin)
        btnsignup=findViewById(R.id.btn_signup)
        auth= FirebaseAuth.getInstance()

        btnsignup.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            }
        btngotologin.setOnClickListener {
            btngotologin()
        }
        }

        private fun btngotologin() {
            val email = etEmail.text.toString()
            val pass = etPass.text.toString()
            // calling signInWithEmailAndPassword(email, pass)
            // function using Firebase auth object
            // On successful response Display a Toast
            auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    val intent=Intent(this,Stockshoe::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "Successfully LoggedIn", Toast.LENGTH_SHORT).show()
                } else
                    Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
            }
        }

    }