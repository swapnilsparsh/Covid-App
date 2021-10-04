package com.example.covidapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.covidapp.R
import com.example.covidapp.data.model.Model
import com.example.covidapp.databinding.ActivitySymptomsBinding
import com.example.covidapp.ui.adapter.SymptomsAdapter

class SymptomsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySymptomsBinding

    private val symptomsList = ArrayList<Model>()
    private val symptomsAdapter by lazy { SymptomsAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySymptomsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@SymptomsActivity, RecyclerView.VERTICAL, false)
            adapter = symptomsAdapter
        }
        symptomsList.add(
            Model(
                R.drawable.cough,
                "Dry Cough",
                "A dry cough is one that does not produce phlegm or mucus."
            )
        )
        symptomsList.add(
            Model(
                R.drawable.fever,
                "Fever",
                "A fever is a temporary increase in your body temperature."
            )
        )
        symptomsList.add(
            Model(
                R.drawable.headache,
                "Head Ache",
                "A painful sensation in any part of the head, ranging from sharp to dull, that may occur with other symptoms."
            )
        )
        symptomsList.add(
            Model(
                R.drawable.sore_throat,
                "Sore Throat",
                "Pain or irritation in the throat that can occur with or without swallowing, often accompanies infections."
            )
        )
        symptomsList.add(
            Model(
                R.drawable.fatigue,
                "Tiredness",
                "Feeling overtired, with low energy and a strong desire to sleep that interferes with normal daily activities."
            )
        )
        symptomsList.add(
            Model(
                R.drawable.loss,
                "Loss of taste or smell",
                "Partial or complete loss of the sense of smell."
            )
        )
        symptomsList.add(
            Model(
                R.drawable.difficulty_breath,
                "Difficulty breathing or shortness of breath",
                "Shortness of breath, is an uncomfortable condition that makes it difficult to fully get air into your lungs."
            )
        )
        symptomsAdapter.submitList(symptomsList)
    }
}
