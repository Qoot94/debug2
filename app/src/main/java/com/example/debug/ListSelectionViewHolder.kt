package com.example.debug

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val viewContext: LinearLayout = itemView.findViewById(R.id.llHolder)
    val listPosition: TextView = itemView.findViewById(R.id.itemNumber)
    val listTitle: TextView = itemView.findViewById(R.id.itemString)
    val listCountry: TextView = itemView.findViewById(R.id.itemString2)


}