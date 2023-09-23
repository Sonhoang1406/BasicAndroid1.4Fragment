package com.example.basicandroid14fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class FragmentA : Fragment() {
    private lateinit var btnChange: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_a,container,false)
        btnChange = view.findViewById(R.id.btnChange)
        btnChange.setOnClickListener {
            replaceFragmentB()
        }
        return view
    }

    private fun replaceFragmentB() {
        val fragmentB = FragmentB()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.containerView, fragmentB)
        transaction.commit()
    }

}