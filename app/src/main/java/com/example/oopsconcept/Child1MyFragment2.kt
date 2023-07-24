package com.example.oopsconcept

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class Child1MyFragment2 : MyFragment2() {

    private lateinit var adapter: MyAdapter
    private lateinit var list: ArrayList<ListItemData>
    private lateinit var recyclerView: RecyclerView

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
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_2)
        val adapter = MyAdapter(this)
        recyclerView.adapter = adapter
    }

    override fun myFunction(position: Int) {
        super.myFunction(position)
        val selectedItem = "Item $position"
        Toast.makeText(requireContext(),selectedItem,Toast.LENGTH_SHORT).show()
    }
}