package com.nureddinelmas.landmarkkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.nureddinelmas.landmarkkotlinproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        // Data
        val pisa = Landmark("Pisa","Italy", R.drawable.pisa)
        val colosseum = Landmark("Colosseum", "Italy", R.drawable.collisium)
        val eiffel = Landmark("Eiffel", "France", R.drawable.eyfel)
        val londonBridge = Landmark("London Bridge", "UK",R.drawable.londonbridge)


        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)

        // Adapter : Layout & Data



        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList)

        binding.listView.adapter = adapter


    }
}