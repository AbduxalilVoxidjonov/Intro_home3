package com.example.homework19_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomFragment(activity: MainActivity,val list: List<DataClass>):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): SecondFragment {
        return SecondFragment().apply {
            arguments = Bundle().apply {
                putInt("img",list[position].img)
                putString("title",list[position].title)
                putString("desc",list[position].desc)
            }
        }
    }
}