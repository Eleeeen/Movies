package com.example.movies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(R.layout.activity_main),
    FragmentMoviesList.FragmentMoviesListClickListener,
    FragmentMoviesDetails.FragmentMovieDetailsClickListener
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            routeToMoviesList()
        }
    }

    override fun onMovieSelected() = routeToMovieDetails()

    override fun onMovieDeselected() = onBackPressed()

    private fun routeToMoviesList() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, FragmentMoviesList.create())
            .addToBackStack("trans:${FragmentMoviesList::class.java.simpleName}")
            .commit()
    }

    private fun routeToMovieDetails() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, FragmentMoviesDetails.create())
            .addToBackStack("trans:${FragmentMoviesDetails::class.java.simpleName}")
            .commit()
    }

    override fun onBackPressed() {
        supportFragmentManager.popBackStack()
    }
}