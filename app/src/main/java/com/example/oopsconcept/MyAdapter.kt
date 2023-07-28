package com.example.oopsconcept

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.oopsconcept.databinding.ItemBinding

class MyAdapter(private val myInterface: MyInterface, private val context: Context?) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    fun submitList(items: List<ListItemData>) {

        itemList = items
    }
    private var itemList: List<ListItemData> = emptyList()

    inner class MyViewHolder(var binding: ItemBinding): RecyclerView.ViewHolder(binding.root){

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
       /* val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return MyViewHolder(view)*/
//        return MyViewHolder(binding.)
        val binding = ItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }


    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val currItem = itemList[position]
        holder.binding.listText.text = currItem.heading
        holder.binding.listNumId.text = currItem.numId.toString()
        holder.itemView.setOnClickListener{
            myInterface.myFunction(position)
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}