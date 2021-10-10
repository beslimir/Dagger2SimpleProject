package com.example.dagger2_again.dagger2

import com.example.dagger2_again.car.Driver
import dagger.Component
import javax.inject.Singleton

//TODO: Create a new scope, PerApplication, like PerActivity (it has the same effect like @Singleton)

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getDriver(): Driver

}