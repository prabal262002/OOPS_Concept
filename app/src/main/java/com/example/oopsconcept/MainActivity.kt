package com.example.oopsconcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.oopsconcept.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 : Button= findViewById(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)

        btn1.setOnClickListener {
        val fragment = MyFragment1()
        replaceFragment(fragment)
        }
        btn2.setOnClickListener {
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