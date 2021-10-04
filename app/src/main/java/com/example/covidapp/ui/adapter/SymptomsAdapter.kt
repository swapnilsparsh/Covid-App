package com.example.covidapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.covidapp.data.model.Model
import com.example.covidapp.databinding.ItemSymptomsBinding

class SymptomsAdapter() :
    ListAdapter<Model, SymptomsAdapter.ViewHolder>(COMPARATOR) {
    companion object {
        private val COMPARATOR = object : DiffUtil.ItemCallback<Model>() {
            override fun areContentsTheSame(oldItem: Model, newItem: Model): Boolean {
                return oldItem.equals(newItem)
            }

            override fun areItemsTheSame(oldItem: Model, newItem: Model): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemSymptomsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(private val binding: ItemSymptomsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(model: Model) = binding.run {
            imageView.setImageResource(model.imageview)
            txtSymptoms.text = model.symptomsText
            txtSymptomsDetail.text = model.symptomsDetail
        }
    }
}
