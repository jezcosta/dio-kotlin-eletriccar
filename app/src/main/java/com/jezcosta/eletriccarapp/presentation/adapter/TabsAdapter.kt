package com.jezcosta.eletriccarapp.presentation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.jezcosta.eletriccarapp.presentation.CarFragment
import com.jezcosta.eletriccarapp.presentation.FavoriteFragment

class TabsAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
       return when(position) {
           0 -> CarFragment()
           1 -> FavoriteFragment()
           else -> CarFragment()
       }
    }
}