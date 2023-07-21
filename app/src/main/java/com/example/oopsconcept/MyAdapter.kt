package com.example.oopsconcept

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val myInterface: MyInterface) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    fun submitList(items: List<ListItemData>) {
        itemList = items
    }
    private var itemList: List<ListItemData> = emptyList()

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var name : TextView = itemView.findViewById(R.id.listText)
        val numId: TextView = itemView.findViewById(R.id.list_Num_id)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val currItem = itemList[position]
        holder.name.text = currItem.heading
        holder.numId.text = currItem.numId.toString()
        holder.itemView.setOnClickListener{
            myInterface.myFunction(position)
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}