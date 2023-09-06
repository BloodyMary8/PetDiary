package com.chernikova.petdiary.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.chernikova.petdiary.R
import com.chernikova.petdiary.databinding.FragmentFavoriteBinding


class FavoriteFragment : Fragment(R.layout.fragment_favorite) {

    private var fragmentFavoriteBinding: FragmentFavoriteBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentFavoriteBinding.bind(view)
        fragmentFavoriteBinding = binding


    }
    override fun onDestroyView() {
        // Consider not storing the binding instance in a field, if not needed.
        fragmentFavoriteBinding = null
        super.onDestroyView()
    }
}
