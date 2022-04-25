package com.example.lesson8task1kotlin.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson8task1kotlin.R

class FragmentActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        initViews()
    }
    fun initViews() {}
}