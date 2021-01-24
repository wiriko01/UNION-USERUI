package com.example.union_user

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyPagerAdapter(activity: IdeFragment)
    : FragmentStateAdapter(activity) {
    var pages = listOf(Tab1IdeFragment(), Tab2IdeFragment())
    override fun getItemCount(): Int = pages.size

    override fun createFragment(position: Int): Fragment {
        return pages[position]
    }
}