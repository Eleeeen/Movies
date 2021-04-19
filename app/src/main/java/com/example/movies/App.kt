package com.example.movies

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router

class App : Application() {
    private val cicerone = Cicerone.create()
    val router get() = cicerone.router
    val navigatorHolder get() = cicerone.getNavigatorHolder()
}

val Activity.router: Router get() = (application as App).router
val Activity.navigatorHolder: NavigatorHolder get() = (application as App).navigatorHolder
val Fragment.router: Router? get() = activity?.router
