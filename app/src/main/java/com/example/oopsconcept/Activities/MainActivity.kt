package com.example.oopsconcept.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.oopsconcept.Fragments.Child1MyFragment2
import com.example.oopsconcept.Fragments.MyFragment1
import com.example.oopsconcept.R
import com.example.oopsconcept.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.logoutBtn.setOnClickListener {

            FirebaseAuth.getInstance().signOut()

            val intent = Intent(this,LoginAndSignUpActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.button1.setOnClickListener {
        val fragment = MyFragment1()
        replaceFragment(fragment)
        }

        binding.button2.setOnClickListener {
            val fragment2 = Child1MyFragment2()
            replaceFragment(fragment2)
        }

    }

    private fun replaceFragment(myFragment1: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,myFragment1)
        fragmentTransaction.commit()
    }
}