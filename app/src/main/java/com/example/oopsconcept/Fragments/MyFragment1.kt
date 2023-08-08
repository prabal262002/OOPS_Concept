package com.example.oopsconcept.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.oopsconcept.AdapterClass.MyAdapter
import com.example.oopsconcept.Inheritance.MyInterface
import com.example.oopsconcept.data.SampleData
import com.example.oopsconcept.databinding.FragmentMyBinding



open class  MyFragment1 : Fragment(), MyInterface {
    private lateinit var binding: FragmentMyBinding
    private lateinit var adapter: MyAdapter
    private val itemlist = listOf<SampleData>(
        SampleData(1,"Ram"),
        SampleData(2,"Shyam"),
        SampleData(3,"Harry"),
        SampleData(4,"Garry"),
        SampleData(5,"Snape"),
        SampleData(6,"Potter"),
        SampleData(7,"Ron"),
        SampleData(8,"Weasley"),
        SampleData(9,"Henry"),
        SampleData(10,"Sejal")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_my, container, false)
        binding = FragmentMyBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = MyAdapter(this,requireContext())
        binding.recyclerView.adapter = adapter
        adapter.submitList(itemlist)

    }

    override fun myFunction(position: Int) {
        val selectedItem = itemlist[position]
        Toast.makeText(requireContext(),"Clicked On ${selectedItem.heading}",Toast.LENGTH_SHORT).show()
    }
}