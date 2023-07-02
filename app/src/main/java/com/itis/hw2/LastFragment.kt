package com.itis.hw2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.itis.hw2.databinding.FragmentLastBinding
import com.google.android.material.snackbar.Snackbar


class LastFragment: Fragment(R.layout.fragment_last) {
    private var binding: FragmentLastBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLastBinding.bind(view)
        val name = arguments?.getString(ClassName)
        val value = requireView()
        Snackbar.make(value,name.toString(),Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    companion object{

        private const val ClassName = "ClassName";

        fun createBundle(nameClass: String) : Bundle{
            var bundle = Bundle();
            bundle.putString(ClassName, nameClass)
            return bundle
        }
    }
}