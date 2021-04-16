package com.example.movies

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class FragmentMoviesDetails : Fragment(R.layout.fragment_movies_details) {
    private val listener: FragmentMovieDetailsClickListener? get() = (activity as? FragmentMovieDetailsClickListener)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view?.findViewById<View>(R.id.tv_back_with_arrow)?.setOnClickListener {
            listener?.onMovieDeselected()
        }
    }

    interface FragmentMovieDetailsClickListener {
        fun onMovieDeselected()
    }

    companion object {
        fun create(): FragmentMoviesDetails = FragmentMoviesDetails()
    }
}