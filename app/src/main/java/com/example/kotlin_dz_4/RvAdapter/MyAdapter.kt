package com.example.kotlin_dz_4.RvAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_dz_4.databinding.ItemRvBinding

class MyAdapter(private val fragments: ArrayList<String>):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private lateinit var binding: ItemRvBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(fragments[position])
    }

    override fun getItemCount(): Int {
        return fragments.size
    }

    fun addItems(fragment: String){
        fragments.add(fragment)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding: ItemRvBinding = ItemRvBinding.bind(itemView)
        fun bind(s: String){
            binding.tvSpisok.text = s
        }

    }
}