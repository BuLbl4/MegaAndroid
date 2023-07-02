package com.itis.hw3


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.itis.hw3.databinding.ItemPlanetBinding

class PlanetAdapter(
    private val list: List<Planet>,
    private val glide: RequestManager,
    private val onItemClick: (Planet) -> Unit,
) : RecyclerView.Adapter<PlanetItem>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): PlanetItem = PlanetItem(
        binding = ItemPlanetBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide,
        onItemClick = onItemClick,
    )

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PlanetItem, position: Int) {
        holder.onBind(list[position])
    }
}