package com.example.tugasandroidadvance_oktariza_mobilea_siang

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentDosen : Fragment() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dosen, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = DosenAdapter(getSampleDataDosen())

        return view
    }

    private fun getSampleDataDosen(): List<Dosen> {
        return listOf(
            Dosen("Marzuki", "Algoritma dan Struktur Data"),
            Dosen("Maria Shusanti Febrianti", "Metodologi Penelitian; Grafika Komputer"),
            Dosen("Riza Muhida", "Pengujian dan Kualitas Sistem; Pengantar Desain Sistem"),
            Dosen("Wamiliana", "Cryptography"),
            Dosen("Robby Yuli Endra", "Teori dan Praktek Pemrograman 1,2,&3; Etika Profesi TI"),
            Dosen("Iing Lukman", "Data Mining; Matematika Dasar; Matematika Diskrit; Logika Matematika dan Analisa Numerik"),
            Dosen("Dian Resha Agustina", "Interaksi Manusia dan Komputer"),
            Dosen("Arnes Yuli Vandika", "Teori Bahasa Formal dan Otomata; Jaringan Komputer"),
            Dosen("Mustofa Usman", "Statistika; Matematika Lanjut"),
            Dosen("Ahmad Cucus", "Analisa Desain Sistem"),
            Dosen("Arga Dwi Saputra", "Analytical and Creative Thinking"),
            Dosen("Yuthsi Aprilinda", "Teori dan Praktek Basis Data 1&2; Personal Development"),
            Dosen("Fenty Ariani", "Pengantar TIK")
            )
    }
}