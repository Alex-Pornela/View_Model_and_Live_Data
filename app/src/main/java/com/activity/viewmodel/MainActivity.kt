package com.activity.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    var count = 0
    //intialize viewModel class
    private lateinit var viewModel : MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCount = findViewById<TextView>(R.id.tvCount)
        val btnCount = findViewById<Button>(R.id.countBtn)

        //get viewModel objects
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        //observe the value of live data
        viewModel.count.observe(this, Observer {
            tvCount.text = it.toString()
        })

        btnCount.setOnClickListener {
            //viewModel function
            viewModel.updateCount()
           
        }
    }
}