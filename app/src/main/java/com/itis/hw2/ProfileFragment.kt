package com.itis.hw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.itis.hw2.databinding.FragmentProfileBinding



class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var binding: FragmentProfileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)

        binding?.run{
            btnToSecretFromProfile.setOnClickListener{
                findNavController().navigate(
                    R.id.action_profileFragment_to_secretFragment,
                    LastFragment.createBundle("From Profile Fragment"))
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}