package com.example.oopsconcept.Fragments

import androidx.fragment.app.Fragment
import com.example.oopsconcept.Inheritance.MyInterface


abstract class MyFragment2 : Fragment(), MyInterface {
    abstract override fun myFunction(position: Int)

}