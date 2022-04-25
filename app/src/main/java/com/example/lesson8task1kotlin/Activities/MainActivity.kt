package com.example.lesson8task1kotlin.Activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.FragmentActivity
import com.example.lesson8task1kotlin.R

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.toString()
    lateinit var tv_home: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        tv_home = findViewById<TextView>(R.id.tv_home)
        val b_detail = findViewById<Button>(R.id.b_detail)
        b_detail.setOnClickListener {
//            var user = User(id = 11, name = "PDP")
//            openDetailActivity(user)
            //openListActivity()
            //openRecyclerActivity()
            //openAdvancedActivity()
            //openFragmentActivity()
            //openRuntimeActivity()
            openViewPagerActivity()

        }
    }

    var detailLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            var result = data!!.getStringExtra("result")
            tv_home.text = result
        }
    }

    fun openFragmentActivity() {
        val intent = Intent(this, FragmentActivity::class.java)
        startActivity(intent)
    }

    fun openRuntimeActivity() {
        val intent = Intent(this, RunTimeActivity::class.java)
        startActivity(intent)
    }

    fun openViewPagerActivity() {
        val intent = Intent(this, ViewPagerActivity::class.java)
        startActivity(intent)
    }

}