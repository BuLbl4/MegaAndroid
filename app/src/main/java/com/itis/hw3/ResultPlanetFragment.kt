package com.itis.hw3

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.itis.hw3.databinding.FragmentResultPlanetBinding
import com.google.android.material.snackbar.Snackbar

class ResultPlanetFragment : Fragment(R.layout.fragment_result_planet) {
    private var binding: FragmentResultPlanetBinding? = null
    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResultPlanetBinding.bind(view)

        var objId = arguments?.getInt(ARG_ID_PLANET)
        var allPlanet = PlanetRepository.getAllPlanet()
        var singlePlanet = allPlanet.firstOrNull{it -> it.id == objId}

        binding?.run {
            textPlanetName.text = "Name: ${singlePlanet?.name} | Id: ${singlePlanet?.id}"

            Glide
                .with(fragmentResult)
                .load(singlePlanet?.url)
                .into(imagePlanet)

            decriptionPlanet.text = singlePlanet?.description
        }


    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    companion object{
        private const val ARG_ID_PLANET = "ARG_PLANET_ID"

        fun createBunle(id:Int) : Bundle{
            var bundle = Bundle()
            bundle.putInt(ARG_ID_PLANET,id)
            return bundle
        }
    }
}