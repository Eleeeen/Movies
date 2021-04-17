package com.example.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.movies.databinding.FragmentMoviesDetailsBinding

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {
    private var _binding:FragmentMoviesDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMoviesDetailsBinding.inflate(inflater, container, false)
        binding.tvBackWithArrow.setOnClickListener{onBackPressed()}

        return binding.root
    }

    private fun onBackPressed(){
        router?.replaceScreen(Screens.MovieList())
    }
}