package com.nureddinelmas.landmarkkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nureddinelmas.landmarkkotlinproject.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}