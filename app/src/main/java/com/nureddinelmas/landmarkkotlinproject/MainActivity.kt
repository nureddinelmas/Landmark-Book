package com.nureddinelmas.landmarkkotlinproject

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nureddinelmas.landmarkkotlinproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        // Data

        val pisa = Landmark("Pisa","Italy", R.drawable.pisa)
        val londonbridge = Landmark ("london Brigde", "England", R.drawable.londonbridge)
        val eiffel = Landmark("Eiffel", "France", R.drawable.eyfel)
        val collosieum = Landmark ("Collosieum", "Italy", R.drawable.kolezyum)

        //Inefficient
        //val pisabitmap = BitmapFactory.decodeResource(resources,R.drawable.pisa)


        landmarkList.add(collosieum)
        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(londonbridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = LandmarkAdapter(landmarkList)

        binding.recyclerView.adapter = adapter

    }
}