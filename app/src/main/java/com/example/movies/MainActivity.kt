package com.example.movies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.androidx.AppNavigator


class MainActivity : AppCompatActivity(R.layout.activity_main){
    private val navigator: Navigator = AppNavigator(this, R.id.container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            router.replaceScreen(Screens.MovieList())
        }
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause(){
        navigatorHolder.removeNavigator()
        super.onPause()
    }

}