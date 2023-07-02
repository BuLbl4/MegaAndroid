package com.itis.hw2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.hw2.databinding.FragmentSettingsBinding
import com.itis.hw2.databinding.FragmentShopBinding

class ShopFragment : Fragment(R.layout.fragment_shop) {
    private var binding: FragmentShopBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentShopBinding.bind(view)
        binding?.run {
            btnFromShopToSecret.setOnClickListener{
                findNavController().navigate(
                    R.id.action_shopFragment_to_secretFragment,
                    LastFragment.createBundle("From Shop!")
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}