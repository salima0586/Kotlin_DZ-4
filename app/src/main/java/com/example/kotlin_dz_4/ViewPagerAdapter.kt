package com.example.kotlin_dz_4

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(private val fragments: ArrayList<Fragment>,mainActivity: MainActivity): FragmentStateAdapter(mainActivity){
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}