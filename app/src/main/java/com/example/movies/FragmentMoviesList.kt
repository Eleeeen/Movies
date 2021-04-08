package com.example.movies

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentMoviesList : Fragment(){
        var listener: FragmentMoviesListClickListener? = null

        override fun onAttach(context: Context) {
            super.onAttach(context)

            if (context is FragmentMoviesListClickListener) {
                listener = context
            }
        }

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            return inflater.inflate(R.layout.fragment_movies_list, container, false)
        }

        override fun onStart() {
            super.onStart()

            view?.findViewById<View>(R.id.movies_list_fragment)?.setOnClickListener {
                listener?.onMovieSelected()
            }
        }

        interface FragmentMoviesListClickListener {
            fun onMovieSelected()
        }

        companion object {
            fun create() = FragmentMoviesList()
        }
    }