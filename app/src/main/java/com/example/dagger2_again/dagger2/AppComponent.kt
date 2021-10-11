package com.example.dagger2_again.dagger2

import com.example.dagger2_again.car.Driver
import dagger.Component

/**
 * Available through the whole lifetime of the app
 *
 * Because we turned ActivityComponent into a subcomponent, we don't need to write the provider method getDriver() and
 * it will be able to access it. We just need now to import a method that returns the Subcomponent class.
 * When using Components as dependencies, we have access just to those methods/objects we explicitly write.
 *
 * Update: when using Subcomponent.Builder, we use the getActivityComponentBuilder() method
 * **/

@PerApplication
@Component(modules = [DriverModule::class])
interface AppComponent {

//    fun getDriver(): Driver

    //factory method
//    fun getActivityComponent(dieselEngineModule: DieselEngineModule): ActivityComponent

    fun getActivityComponentBuilder(): ActivityComponent.Builder

}