package com.example.dagger2_again.dagger2

import com.example.dagger2_again.car.Driver
import dagger.Component

/**
 * Available through the whole lifetime of the app
 * **/

@PerApplication
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getDriver(): Driver

}