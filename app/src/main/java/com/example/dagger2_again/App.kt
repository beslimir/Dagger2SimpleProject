package com.example.dagger2_again

import android.app.Application
import com.example.dagger2_again.dagger2.CarComponent
import com.example.dagger2_again.dagger2.DaggerCarComponent

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