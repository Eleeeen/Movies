package com.example.movies

import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun MovieList(): FragmentScreen = FragmentScreen {FragmentMoviesList()}
    fun MovieDetails(): FragmentScreen = FragmentScreen{FragmentMoviesDetails()}
}