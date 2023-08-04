package com.example.oopsconcept.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.oopsconcept.AdapterClass.MyAdapter
import com.example.oopsconcept.data.SampleData
import com.example.oopsconcept.databinding.FragmentChild1My2Binding


class Child1MyFragment2 : MyFragment2() {

    private lateinit var binding: FragmentChild1My2Binding
    private lateinit var adapter: MyAdapter
    private val itemlist = listOf<SampleData>(
        SampleData(1,"Ram"),
        SampleData(2,"Shyam"),
        SampleData(3,"Harry"),
        SampleData(4,"Sejal")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChild1My2Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView3.layoutManager = LinearLayoutManager(context)
        adapter = MyAdapter(this,requireContext())
        binding.recyclerView3.adapter = adapter
        adapter.submitList(itemlist)
    }

    override fun myFunction(position: Int) {
        val selectedItem = "Item $position"
        Toast.makeText(requireContext(),selectedItem,Toast.LENGTH_SHORT).show()
    }
}