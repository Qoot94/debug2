package com.example.debug

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_selection_view_holder.view.*

class ListSelectionRecyclerViewAdapter(private val stateAndCapitals: ArrayList<ArrayList<String>>) :
    RecyclerView.Adapter<ListSelectionViewHolder>() {
lateinit var myView: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_selection_view_holder, parent, false)
        myView = view.context
        return ListSelectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.listPosition.text = (position+1).toString()
        holder.listTitle.text = stateAndCapitals[position][1]
        holder.listCountry.text = stateAndCapitals[position][0]

        holder.itemView.setOnClickListener {
            Toast.makeText(myView, "Country: ${stateAndCapitals[position][0]}, capital: ${stateAndCapitals[position][1]}", LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return stateAndCapitals.size
    }

}