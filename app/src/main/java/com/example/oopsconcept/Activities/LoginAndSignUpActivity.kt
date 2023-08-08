package com.example.oopsconcept.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.oopsconcept.Fragments.LoginFragment
import com.example.oopsconcept.R
import com.example.oopsconcept.databinding.ActivityLoginAndSignUpBinding

class LoginAndSignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginAndSignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login_and_sign_up)
        setContentView(R.layout.activity_login_and_sign_up)

        if (savedInstanceState == null) {
            val fragment = LoginFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.login_frameLayout, fragment)
                .commit()
        }

    }
}