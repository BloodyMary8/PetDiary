package com.chernikova.petdiary.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.chernikova.petdiary.R
import com.chernikova.petdiary.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment(R.layout.fragment_details) {

    private var fragmentDetailsBinding: FragmentDetailsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentDetailsBinding.bind(view)
        fragmentDetailsBinding = binding

        binding.textReceiver.text = arguments?.getString("input")

    }
    override fun onDestroyView() {
        // Consider not storing the binding instance in a field, if not needed.
        fragmentDetailsBinding = null
        super.onDestroyView()
    }
}