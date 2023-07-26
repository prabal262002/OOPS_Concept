package com.example.oopsconcept

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.oopsconcept.databinding.FragmentMyBinding



open class MyFragment1 : Fragment(),MyInterface {
    private lateinit var binding: FragmentMyBinding
    private lateinit var adapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = MyAdapter(this,context)
        binding.recyclerView.adapter = adapter

        adapter.submitList(itemlist)

    }
    private val itemlist = listOf<ListItemData>(
        ListItemData(1,"Ram"),
        ListItemData(2,"Shyam"),
        ListItemData(3,"Harry"),
        ListItemData(4,"Garry"),
        ListItemData(5,"Snape"),
        ListItemData(6,"Potter"),
        ListItemData(7,"Ron"),
        ListItemData(8,"Weasley"),
        ListItemData(9,"Henry"),
        ListItemData(10,"Sejal")
    )
    override fun myFunction(position: Int) {
        val selectedItem = itemlist[position]
        Toast.makeText(requireContext(),"Clicked On ${selectedItem.heading}",Toast.LENGTH_SHORT).show()
    }
}