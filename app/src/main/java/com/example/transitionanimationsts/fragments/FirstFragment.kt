package com.example.transitionanimationsts.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.transitionanimationsts.R
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.btnFirstGoHome.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }
        return view
    }

}