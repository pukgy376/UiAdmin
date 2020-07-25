package com.example.uiadmin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class IsaanAdapter (val userList: ArrayList<Isaan>) : RecyclerView.Adapter<IsaanAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_isaan, parent, false)
        return ViewHolder(v)

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val record: Isaan = userList[position]
        holder?.textViewname?.text = record.name
        holder?.textviewdetail?.text = record.detail


    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewname = itemView.findViewById(R.id.username) as TextView
        val textviewdetail = itemView.findViewById(R.id.material) as TextView


    }
}