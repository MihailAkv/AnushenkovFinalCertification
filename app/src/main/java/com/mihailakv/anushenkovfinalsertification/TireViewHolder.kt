package com.mihailakv.anushenkovfinalsertification

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TireViewHolder(itemView: View) :  RecyclerView.ViewHolder (itemView) {

    fun bind (tire: Tire){
        val tireBrandTextView: TextView = itemView.findViewById(R.id.tire_brand_text_view)
        val tireDiameterTextView: TextView = itemView.findViewById(R.id.tire_diameter_text_view)
        val tireWidthTextView: TextView = itemView.findViewById(R.id.tire_width_text_view)
        val tireProfileTextView: TextView = itemView.findViewById(R.id.tire_profile_text_view)
        tireBrandTextView.text = tire.brand
        tireDiameterTextView.text = tire.diameter
        val widthFormatted = "${tire.width} mm"
        tireWidthTextView.text = widthFormatted
        val profileFormatted = "${tire.profile} mm"
        tireProfileTextView.text = profileFormatted

    }

}