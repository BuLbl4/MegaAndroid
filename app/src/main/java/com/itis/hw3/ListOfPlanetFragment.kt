package com.itis.hw3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.itis.hw3.databinding.FragmentListOfPlanetBinding

class ListOfPlanetFragment : Fragment(R.layout.fragment_list_of_planet) {
    private var binding: FragmentListOfPlanetBinding? = null
    private var adapter: PlanetAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListOfPlanetBinding.bind(view)
        initAdapter()
    }

    private fun initAdapter(){
        adapter = PlanetAdapter(
            list = PlanetRepository.list,
            glide = Glide.with(this)
        ) { planet ->
            findNavController().navigate(
                R.id.action_listOfPlanetFragment_to_resultPlanetFragment,
                ResultPlanetFragment.createBunle(planet.id)
            )
        }
        binding?.rvEarth?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}