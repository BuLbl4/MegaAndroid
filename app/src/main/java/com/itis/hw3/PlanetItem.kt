package com.itis.hw3

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.RequestManager
import com.itis.hw3.databinding.ItemPlanetBinding

class PlanetItem(
    private val binding: ItemPlanetBinding,
    private val glide:  RequestManager,
    private val onItemClick: (Planet) -> Unit,
) : ViewHolder(binding.root) {

    fun onBind(planet: Planet){
        binding.run{
            tvTittle.text = planet.name
            tvDesc.text = planet.description

            glide
                .load(planet.url)
                .into(ivImage)

            root.setOnClickListener{
                onItemClick(planet)
            }
        }
    }
}