package com.example.tugasandroidadvance_oktariza_mobilea_siang

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


    abstract class AdapterMatkul (private val listmatkul: List<MataKuliah>) : RecyclerView.Adapter<AdapterMatkul.MataKuliahViewHolder>() {
    class MataKuliahViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val namaMataKuliah: TextView = itemView.findViewById(R.id.namaMataKuliah)
        val pengajar: TextView = itemView.findViewById(R.id.namaDosen)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MataKuliahViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_matkul, parent, false)
        return MataKuliahViewHolder(view)
    }
}
