package com.chernikova.petdiary.fragments


import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import com.chernikova.petdiary.MainActivity
import com.chernikova.petdiary.R
import com.chernikova.petdiary.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            (activity as MainActivity).passData(binding.editText.text.toString())
        }

    }

    override fun onDestroyView() {
        // Consider not storing the binding instance in a field, if not needed.
        var fragmentHomeBinding = null
        super.onDestroyView()
    }
}




