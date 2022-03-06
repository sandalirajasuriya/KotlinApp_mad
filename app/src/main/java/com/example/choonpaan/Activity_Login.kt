package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.choonpaan.database.entity.User
import com.onepos.posandroidv2.database.repository.UserRepo

class Activity_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val backbutton1: Button =findViewById<Button>(R.id.cancelButton)
        val forgotButton: Button =findViewById<Button>(R.id.forgotPwButton)
        val signbtn:Button=findViewById(R.id.signInLpageButton)

        backbutton1.setOnClickListener {
            val intent= Intent(this,Payment::class.java)
            startActivity(intent)
        }

        forgotButton.setOnClickListener {
            val intent= Intent(this,ForgetPassword::class.java)
            startActivity(intent)
        }

        signbtn.setOnClickListener {
            var repo=UserRepo.getInstance(this)
            var user: User? = repo.getUserByEmail("email")
            if (user == null){

            }
            else{
                if (pw==user.password){

                }
            }

//            val intent= Intent(this,RegistrationActivity::class.java)
//            startActivity(intent)
        }
    }
}