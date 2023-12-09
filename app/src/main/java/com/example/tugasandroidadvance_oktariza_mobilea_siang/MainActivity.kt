package com.example.tugasandroidadvance_oktariza_mobilea_siang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: MaterialToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        recyclerView = findViewById(R.id.recyclerView)
        bottomNavigation = findViewById(R.id.bottomNavigation)

        // Inisialisasi RecyclerView
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        // Inisialisasi adapter dan set untuk RecyclerView
        val mataKuliahList = generateSampleData()
        val adapter = AdapterMatkul(mataKuliahList)
        recyclerView.adapter = adapter

        // Set listener untuk Bottom Navigation
        bottomNavigation.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.namaMataKuliah -> {
                    val mataKuliahList = generateSampleData()
                    adapter.updateData(mataKuliahList)
                    true
                }
                R.id.namaDosen -> {
                    adapter.updateData(Dosen)
                    true
                }
                else -> false
            }
        }
    }

    private fun generateSampleData(): List<MataKuliah> {
        return listOf(
            MataKuliah("Algoritma dan Struktur Data", "Marzuki", "Mata Kuliah Prodi"),
            MataKuliah("Metodologi Penelitian", "Maria Shusanti Febrianti", "Mata Kuliah Prodi"),
            MataKuliah("Pengujian dan Kualitas Sistem", "Riza Muhida", "Mata Kuliah Fakultas"),
            MataKuliah("Cryptography", "Wamiliana", "Mata Kuliah Prodi")
        )
    }

    private fun generateSampleDataDosen(): List<Dosen> {
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