package com.chernikova.petdiary.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.chernikova.petdiary.R
import com.chernikova.petdiary.databinding.FragmentSettingBinding


class SettingFragment : Fragment(R.layout.fragment_setting) {

    private var fragmentSettingBinding: FragmentSettingBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentSettingBinding.bind(view)
        fragmentSettingBinding = binding

    }
    override fun onDestroyView() {
        // Consider not storing the binding instance in a field, if not needed.
        fragmentSettingBinding = null
        super.onDestroyView()
    }
}

