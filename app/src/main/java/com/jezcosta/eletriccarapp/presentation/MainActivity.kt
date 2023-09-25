package com.jezcosta.eletriccarapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.jezcosta.eletriccarapp.R
import com.jezcosta.eletriccarapp.presentation.adapter.TabsAdapter

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
        setupTabs()
    }

    fun setupView() {
        tabLayout = findViewById(R.id.tab_layout)
        viewPager = findViewById(R.id.vp_pager)
    }

    fun setupTabs() {
        val tabsAdapter = TabsAdapter(this)
        viewPager.adapter = tabsAdapter
    }

    fun setupListeners() {
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    viewPager.currentItem = it.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.getTabAt(position)?.select()
            }
        })
    }

    override fun onPause() {
        // triggered when app is running as secondary task
        super.onPause()
    }

    override fun onResume() {
        // triggered when app returns to first task
        super.onResume()
    }

    override fun onStart() {
        // triggered after onCreate
        super.onStart()
    }

    override fun onStop() {
        // triggered when activity stop, after onPause
        super.onStop()
    }

    override fun onDestroy() {
        // triggered when activity is closed/destroyed
        super.onDestroy()
    }
}