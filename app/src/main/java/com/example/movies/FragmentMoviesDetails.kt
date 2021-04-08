package com.example.movies

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentMoviesDetails : Fragment(){
    var listener: FragmentMovieDetailsClickListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is FragmentMovieDetailsClickListener) {
            listener = context
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_details, container, false)
    }

    override fun onStart() {
        super.onStart()

        view?.findViewById<View>(R.id.back_button)?.setOnClickListener {
            listener?.onMovieDeselected()
        }
    }

    interface FragmentMovieDetailsClickListener {
        fun onMovieDeselected()
    }

    companion object {
        fun create() = FragmentMoviesDetails()
    }
}