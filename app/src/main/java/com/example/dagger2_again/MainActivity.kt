package com.example.dagger2_again

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2_again.car.Car
import com.example.dagger2_again.car.DieselEngine
import com.example.dagger2_again.dagger2.DaggerCarComponent
import com.example.dagger2_again.dagger2.DieselEngineModule
import javax.inject.Inject

/** The DaggerCarComponent.create() is only possible if there are no parameters in the constructor in
 * any of our modules. Otherwise, we use .builder() and add the property .dieselEngineModule() - our
 * module which has a parameter in the constructor**/

class MainActivity : AppCompatActivity() {

//    private lateinit var car: Car
    @Inject lateinit var car1: Car //field injection
    @Inject lateinit var car2: Car //field injection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val carComponent = DaggerCarComponent.create()

//        val carComponent = DaggerCarComponent.builder()
//            .dieselEngineModule(DieselEngineModule(105))
//            .build()

        val carComponent = DaggerCarComponent.builder()
            .horsePower(105)
            .engineCapacity(1600)
            .build()

//        car = carComponent.getCar()
        carComponent.inject(this)
        car1.drive()
        car2.drive()
    }
}