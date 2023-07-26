package com.example.oopsconcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.oopsconcept.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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