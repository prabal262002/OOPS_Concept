package com.example.oopsconcept.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.oopsconcept.ListItemData
import com.example.oopsconcept.MyAdapter
import com.example.oopsconcept.MyInterface
import com.example.oopsconcept.R
import com.example.oopsconcept.databinding.FragmentMy2Binding


abstract class MyFragment2 : Fragment(), MyInterface {

    private lateinit var adapter: MyAdapter
    private lateinit var binding: FragmentMy2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = MyAdapter(this,context)
        binding.recyclerView2.layoutManager = LinearLayoutManager(context)
        binding.recyclerView2.adapter = adapter

        adapter.submitList(itemlist)

    }
    private val itemlist = listOf<ListItemData>(
        ListItemData(1,"Ram"),
        ListItemData(2,"Shyam"),
        ListItemData(3,"Harry"),
        ListItemData(4,"Sejal")
    )

    override fun myFunction(position: Int) {

    }

}