package com.example.lesson8task1kotlin.Activities

import android.nfc.Tag
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson8task1kotlin.Fragments.FirstFragment
import com.example.lesson8task1kotlin.Fragments.SecondFragment
import com.example.lesson8task1kotlin.R

class RunTimeActivity: AppCompatActivity() {
    val TAG = RunTimeActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_runtime)
        initViews()
    }

    private fun  initViews(){
        addFirstFragment()
        addSecondFragment()
    }

    private fun addFirstFragment(){
        val ff = supportFragmentManager.beginTransaction()
        ff.add(R.id.frameFirst, FirstFragment(), "firstFragment")
        ff.commit()
    }

    private fun addSecondFragment(){
        val sf = supportFragmentManager.beginTransaction()
        sf.add(R.id.frameSecond, SecondFragment(), "secondFragment")
        sf.commit()
    }

}