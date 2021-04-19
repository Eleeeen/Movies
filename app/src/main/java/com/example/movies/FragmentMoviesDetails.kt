package com.example.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.movies.databinding.FragmentMoviesDetailsBinding

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {
    private val binding by viewBinding(FragmentMoviesDetailsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvBackWithArrow.setOnClickListener { onBackPressed() }
    }
    private fun onBackPressed() {
        router?.exit()
    }
}