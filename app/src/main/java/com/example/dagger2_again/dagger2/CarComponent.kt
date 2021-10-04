package com.example.dagger2_again.dagger2

import com.example.dagger2_again.MainActivity
import com.example.dagger2_again.car.Car
import dagger.Component

/** We need this Component interface in order to produce Cars.
 * We can use the first function, getCar(), and call it from MainActivity.
 * The other way is to create an inject() function, and to call it in MainActivity, so all parts
 * of the Car class would Inject automatically after the constructor finishes (fields and methods). **/

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

}