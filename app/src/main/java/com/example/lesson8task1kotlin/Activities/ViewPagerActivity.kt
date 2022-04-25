package com.example.lesson8task1kotlin.Activities

import android.os.Bundle
import android.widget.TableLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.lesson8task1kotlin.Adapter.ViewPagerAdapter
import com.example.lesson8task1kotlin.Fragments.PageOneFragment
import com.example.lesson8task1kotlin.Fragments.PageTwoFragment
import com.example.lesson8task1kotlin.R

class ViewPagerActivity: AppCompatActivity() {
    val TAG = ViewPagerActivity::class.java.toString()

    private var viewPagerAdapter: ViewPagerAdapter? = null
    private var viewPager: ViewPager? = null
    private var tabLayout: TableLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager)
        initViews()
    }

    fun initViews() {
        viewPager = findViewById(R.id.viewpager)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        viewPagerAdapter!!.add(PageOneFragment(), "Page 1")
        viewPagerAdapter!!.add(PageTwoFragment(), "Page 2")

        viewPager!!.setAdapter(viewPagerAdapter)

        tabLayout = findViewById(R.id.tab_layout)

    }
}