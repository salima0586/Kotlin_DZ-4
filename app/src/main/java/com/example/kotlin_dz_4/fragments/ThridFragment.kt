package com.example.kotlin_dz_4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin_dz_4.MainViewModel
import com.example.kotlin_dz_4.R
import com.example.kotlin_dz_4.RvAdapter.MyAdapter
import com.example.kotlin_dz_4.databinding.FragmentThridBinding


class ThridFragment : Fragment() {

    private lateinit var binding: FragmentThridBinding
    private lateinit var viewModel: MainViewModel
    private var myAdapter: MyAdapter? = null
    private var list: ArrayList<String> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentThridBinding.inflate(inflater,container,false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        viewModel.logika.observe(viewLifecycleOwner,{ commands->
            myAdapter?.addItems(commands.toString())
        })

        myAdapter = MyAdapter(list)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = myAdapter
        }

    }
 }
