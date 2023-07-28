package com.example.oopsconcept

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.oopsconcept.databinding.FragmentMy2Binding


class Child1MyFragment2 : MyFragment2() {

    private lateinit var binding: FragmentMy2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MyAdapter(this,context)
        binding.recyclerView2.adapter = adapter
    }

    override fun myFunction(position: Int) {
        super.myFunction(position)
        val selectedItem = "Item $position"
        Toast.makeText(requireContext(),selectedItem,Toast.LENGTH_SHORT).show()
    }
}