package com.mihailakv.anushenkovfinalsertification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainFragment : Fragment() {

    private val tireList: List<Tire> = listOf(
        Tire("Dunlop", "R17", 215, 60),
        Tire("Yokohama", "R17", 185, 45),
        Tire("Toyo", "R15", 175, 55),
        Tire("Michelin", "R14", 155, 65),
        Tire("Nokian", "R19", 155, 70),
        Tire("Viatti", "R14", 175, 65)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)


    val tiresRecyclerView: RecyclerView = view.findViewById(R.id.tires_recycler_view)
    tiresRecyclerView.layoutManager =
    LinearLayoutManager (context, LinearLayoutManager.VERTICAL, false)

    tiresRecyclerView.addItemDecoration(
        DividerItemDecoration(
            context,
        DividerItemDecoration.VERTICAL
        )
    )

    tiresRecyclerView.adapter = TireAdapter (tireList)


        return view
    }
}