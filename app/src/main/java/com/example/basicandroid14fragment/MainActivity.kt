package com.example.basicandroid14fragment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragA = FragmentA()
        val fragB = FragmentB()
        supportFragmentManager.beginTransaction().apply {
            this.add(R.id.containerView, fragA)
            commit()
        }
    }
}