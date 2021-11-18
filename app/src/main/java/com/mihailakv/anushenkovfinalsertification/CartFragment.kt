package com.mihailakv.anushenkovfinalsertification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class CartFragment : Fragment() {

    private lateinit var backButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cart, container, false)

        backButton = view.findViewById(R.id.back_button)

        val menuFragment = CartFragment ()
        backButton.setOnClickListener{
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, menuFragment)
                ?.commit ()
        }
        return view
    }
}