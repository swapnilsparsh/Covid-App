package com.example.covidapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_symptoms.*

class SymptomsActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptoms)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)
        val symptomsList = ArrayList<Model>()
        symptomsList.add(Model(R.drawable.cough,"Dry Cough","A dry cough is one that does not produce phlegm or mucus."))
        symptomsList.add(Model(R.drawable.fever,"Fever","A fever is a temporary increase in your body temperature."))
        symptomsList.add(Model(R.drawable.headache,"Head Ache","A painful sensation in any part of the head, ranging from sharp to dull, that may occur with other symptoms."))
        symptomsList.add(Model(R.drawable.sore_throat,"Sore Throat","Pain or irritation in the throat that can occur with or without swallowing, often accompanies infections."))
        symptomsList.add(Model(R.drawable.fatigue,"Tiredness","Feeling overtired, with low energy and a strong desire to sleep that interferes with normal daily activities."))
        symptomsList.add(Model(R.drawable.loss,"Loss of taste or smell","Partial or complete loss of the sense of smell."))
        symptomsList.add(Model(R.drawable.difficulty_breath,"Difficulty breathing or shortness of breath","Shortness of breath, is an uncomfortable condition that makes it difficult to fully get air into your lungs."))


        val symptomsAdapter = SymptomsAdapter(symptomsList)

        recyclerView.adapter = symptomsAdapter
    }
}