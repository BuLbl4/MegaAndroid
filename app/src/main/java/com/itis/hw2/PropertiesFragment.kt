package com.itis.hw2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.hw2.databinding.FragmentPropertiesBinding


class PropertiesFragment : Fragment(R.layout.fragment_properties) {
    private var binding: FragmentPropertiesBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPropertiesBinding.bind(view)

        binding?.run {
            btnToSecretSegment.setOnClickListener{
                findNavController().navigate(
                    R.id.action_listFragment_to_secretFragment,
                    LastFragment.createBundle("From PropertiesFragment!")
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}