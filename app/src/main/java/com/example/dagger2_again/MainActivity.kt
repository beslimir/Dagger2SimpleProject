package com.example.dagger2_again

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2_again.car.Car
import com.example.dagger2_again.dagger2.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    private lateinit var car: Car
    @Inject lateinit var car: Car //field injection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()

//        car = carComponent.getCar()
        carComponent.inject(this)
        car.drive()
    }
}