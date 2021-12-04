package com.example.kotlin_dz_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.kotlin_dz_4.databinding.ActivityMainBinding
import com.example.kotlin_dz_4.fragments.FirstFragment
import com.example.kotlin_dz_4.fragments.SecondFragment
import com.example.kotlin_dz_4.fragments.ThridFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragments: ArrayList<Fragment> = arrayListOf(
                FirstFragment(),
                SecondFragment(),
                ThridFragment())

        val viewPager2 =  ViewPagerAdapter(fragments,this)
        binding.viewPager2.adapter = viewPager2
    }
}