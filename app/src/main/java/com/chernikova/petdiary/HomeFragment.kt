package com.chernikova.petdiary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.chernikova.petdiary.databinding.FragmentFavoriteBinding
import com.chernikova.petdiary.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {

        private var fragmentHomeBinding: FragmentHomeBinding? = null


        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            val binding = FragmentHomeBinding.bind(view)
            fragmentHomeBinding = binding


        }
        override fun onDestroyView() {
            // Consider not storing the binding instance in a field, if not needed.
            fragmentHomeBinding = null
            super.onDestroyView()
        }
    }
