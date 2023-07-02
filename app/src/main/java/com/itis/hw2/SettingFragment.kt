package com.itis.hw2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.hw2.databinding.FragmentMainBinding
import com.itis.hw2.databinding.FragmentSettingsBinding

class SettingFragment : Fragment(R.layout.fragment_settings) {
    private var binging: FragmentSettingsBinding? = null;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binging = FragmentSettingsBinding.bind(view)

        binging?.run {
            btnToSecretFromSettings.setOnClickListener{
                findNavController().navigate(
                    R.id.action_settingsFragment_to_secretFragment,
                    LastFragment.createBundle("From settings Fragment"))
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binging = null
    }
}