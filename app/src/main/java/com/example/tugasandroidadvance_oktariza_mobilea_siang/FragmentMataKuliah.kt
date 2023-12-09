package com.example.tugasandroidadvance_oktariza_mobilea_siang

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentMataKuliah : Fragment() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mata_kuliah, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)

        // Inisialisasi RecyclerView
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager

        // Inisialisasi adapter dan set untuk RecyclerView
        val mataKuliahList = getSampleDataMataKuliah()
        val adapter = AdapterMatkul(mataKuliahList)
        recyclerView.adapter = adapter

        return view
    }

    private fun getSampleDataMataKuliah(): List<MataKuliah> {
        return listOf(
            MataKuliah("Algoritma dan Struktur Data", "Marzuki", "Mata Kuliah Prodi"),
            MataKuliah("Metodologi Penelitian", "Maria Shusanti Febrianti", "Mata Kuliah Prodi"),
            MataKuliah("Pengujian dan Kualitas Sistem", "Riza Muhida", "Mata Kuliah Fakultas"),
            MataKuliah("Cryptography", "Wamiliana", "Mata Kuliah Prodi")
        )
    }
}