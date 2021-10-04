package com.example.covidapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.covidapp.R
import com.example.covidapp.data.model.Model
import com.example.covidapp.databinding.ActivityPrecautionBinding
import com.example.covidapp.ui.adapter.PrecautionsAdapter

class PrecautionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPrecautionBinding
    private val precautionsAdapter by lazy { PrecautionsAdapter() }
    private val precautionsList = ArrayList<Model>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrecautionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.apply {
            layoutManager =
                LinearLayoutManager(this@PrecautionActivity, RecyclerView.VERTICAL, false)
            adapter = precautionsAdapter
        }
        precautionsList.add(
            Model(
                R.drawable.vaccine,
                "Get Vaccinated",
                "Get vaccinated and protect yourself and others from corona"
            )
        )
        precautionsList.add(
            Model(
                R.drawable.handwash,
                "Hand Wash",
                " Wash your hands well and often. Use hand sanitizer when you’re not near soap and water."
            )
        )
        precautionsList.add(
            Model(
                R.drawable.mask,
                "Wear Mask",
                "Masks are a key measure to suppress transmission and save lives."
            )
        )
        precautionsList.add(
            Model(
                R.drawable.home,
                "Stay at Home",
                "When you stay home, you help stop the spread to others, too."
            )
        )
        precautionsList.add(
            Model(
                R.drawable.socialdistance,
                "Social Distance",
                "When going out in public, maintain distance from other people ."
            )
        )

        precautionsAdapter.submitList(precautionsList)
    }
}
