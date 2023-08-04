package com.example.oopsconcept.AdapterClass

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.oopsconcept.Inheritance.MyInterface
import com.example.oopsconcept.data.SampleData
import com.example.oopsconcept.databinding.ItemBinding

class MyAdapter(private val myInterface: MyInterface, private val context: Context) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    private var itemList: List<SampleData> = emptyList()
    fun submitList(items: List<SampleData>) {
        itemList = items
    }

    inner class MyViewHolder(var binding: ItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(SampleData: SampleData){
            binding.listitemData = SampleData
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       /* val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return MyViewHolder(view)*/
//        return MyViewHolder(binding.)
        val inflater = LayoutInflater.from(context)
        val binding = ItemBinding.inflate(inflater,parent,false)
        return MyViewHolder(binding)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currItem = itemList[position]
//        holder.binding.listText.text = currItem.heading
//        holder.binding.listNumId.text = currItem.numId.toString()
        holder.bind(currItem)
        holder.itemView.setOnClickListener{
            myInterface.myFunction(position)
        }

    }

    override fun getItemCount(): Int = itemList.size

}