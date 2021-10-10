package com.example.dagger2_again

import android.app.Application
import com.example.dagger2_again.dagger2.AppComponent
import com.example.dagger2_again.dagger2.DaggerAppComponent

/**
 * In order to have an application scope, we implement this Class and add it to Manifest in .name parameter.
 * Now, we will have the same driver in the lifetime of the app, but the cars will instantiate again
 * if we rotate the screen, for example, because car's scope isn't the same as the application's.
 * **/

class App : Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        //commented while added AppComponent
//        component = DaggerCarComponent.builder()
//            .horsePower(120)
//            .engineCapacity(1400)
//            .build()

        component = DaggerAppComponent.create()
    }

    fun getAppComponent(): AppComponent = component
}