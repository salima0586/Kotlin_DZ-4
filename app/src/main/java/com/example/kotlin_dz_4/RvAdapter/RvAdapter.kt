package com.example.kotlin_dz_4.RvAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_dz_4.databinding.ItemRvBinding

class RvAdapter(private var logic: ArrayList<String>): RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    private lateinit var binding: ItemRvBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(logic[position])
    }

    override fun getItemCount(): Int {
        return logic.size
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        private val binding = ItemRvBinding.bind(itemView)
        fun onBind(A:String){
            binding.tvSpisok.text = A
        }

    }
}