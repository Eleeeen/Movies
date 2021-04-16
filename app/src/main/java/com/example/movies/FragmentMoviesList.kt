package com.example.movies

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list) {
    private val listener: FragmentMoviesListClickListener? get() = (activity as? FragmentMoviesList.FragmentMoviesListClickListener)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view?.findViewById<View>(R.id.movies_list_fragment)?.setOnClickListener {
            listener?.onMovieSelected()
        }
    }

    interface FragmentMoviesListClickListener {
        fun onMovieSelected()
    }

    companion object {
        fun create(): FragmentMoviesList = FragmentMoviesList()
    }
}