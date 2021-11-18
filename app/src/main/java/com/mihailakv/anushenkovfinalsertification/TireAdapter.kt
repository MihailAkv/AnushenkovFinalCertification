package com.mihailakv.anushenkovfinalsertification

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TireAdapter (private val tireList:List <Tire>): RecyclerView.Adapter <TireViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TireViewHolder {
        val tireListItemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.tire_list_item, parent, false)

        return TireViewHolder(tireListItemView)
    }

    override fun onBindViewHolder(holder: TireViewHolder, position: Int) {
        val tire = tireList [position]
        holder.bind(tire)
    }

    override fun getItemCount(): Int {
        return tireList.size
    }
}