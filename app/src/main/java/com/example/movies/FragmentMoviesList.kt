package com.example.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.movies.databinding.FragmentMoviesListBinding

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {
    private var _binding: FragmentMoviesListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMoviesListBinding.inflate(inflater, container, false)
        binding.includeMovieCard.movieFragmentCard.setOnClickListener { onCardPressed() }
        return binding.root
    }

    private fun onCardPressed() {
        router?.replaceScreen(Screens.MovieDetails())
    }
}