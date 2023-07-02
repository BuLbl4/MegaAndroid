package com.itis.hw3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.itis.hw3.databinding.FragmentSeeMoreBinding

class SeeMoreFragment : Fragment(R.layout.fragment_see_more) {
    private var binding: FragmentSeeMoreBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSeeMoreBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}