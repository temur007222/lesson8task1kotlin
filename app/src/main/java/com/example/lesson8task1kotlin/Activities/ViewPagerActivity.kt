package com.example.lesson8task1kotlin.Activities

import android.os.Bundle
import android.widget.TableLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.lesson8task1kotlin.Adapter.ViewPagerAdapter
import com.example.lesson8task1kotlin.Fragments.PageOneFragment
import com.example.lesson8task1kotlin.Fragments.PageTwoFragment
import com.example.lesson8task1kotlin.R
import com.google.android.material.tabs.TabLayout

class ViewPagerActivity: AppCompatActivity() {
    val TAG = ViewPagerActivity::class.java.toString()

    private var viewPagerAdapter: ViewPagerAdapter? = null
    private var viewPager: ViewPager? = null
    private var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager)
        initViews()
    }

    fun initViews() {
        viewPager = findViewById(R.id.viewpager)
        // setting up the adapter
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        // add the fragments
        viewPagerAdapter!!.add(PageOneFragment(), "Page 1")
        viewPagerAdapter!!.add(PageTwoFragment(), "Page 2")
        // Set the adapter
        viewPager!!.setAdapter(viewPagerAdapter)
        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout)
        tabLayout!!.setupWithViewPager(viewPager)
    }
}
