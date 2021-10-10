package com.example.dagger2_again

import android.app.Application
import com.example.dagger2_again.dagger2.CarComponent
import com.example.dagger2_again.dagger2.DaggerCarComponent

/**
 * In order to have an application scope, we implement this Class and add it to Manifest in .name parameter.
 * Now, we will have the same driver in the lifetime of the app, but the cars will instantiate again
 * if we rotate the screen, for example, because car's scope isn't the same as the application's.
 * **/

class App: Application() {

    private lateinit var component: CarComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerCarComponent.builder()
            .horsePower(120)
            .engineCapacity(1400)
            .build()
    }

    fun getAppComponent(): CarComponent = component
}