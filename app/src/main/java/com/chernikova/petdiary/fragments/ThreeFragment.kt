package com.chernikova.petdiary.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.chernikova.petdiary.R
import com.chernikova.petdiary.databinding.FragmentDetailsBinding
import com.chernikova.petdiary.databinding.FragmentThreeBinding

class ThreeFragment : Fragment(R.layout.fragment_three) {

    private var fragmentThreeBinding: FragmentThreeBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentThreeBinding.bind(view)
        fragmentThreeBinding = binding

        binding.textReceiver.text = arguments?.getString("input")

    }
    override fun onDestroyView() {
        // Consider not storing the binding instance in a field, if not needed.
        fragmentThreeBinding = null
        super.onDestroyView()
    }
}