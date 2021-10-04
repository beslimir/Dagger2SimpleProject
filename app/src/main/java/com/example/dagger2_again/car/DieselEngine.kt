package com.example.dagger2_again.car

import android.util.Log
import javax.inject.Inject

/** Add the horsePower parameter to the constructor, and remove @Inject annotation
 * because we now call the instance by ourselves **/

class DieselEngine constructor(var horsePower: Int): Engine {

    override fun startEngine() {
        Log.d("TAG", "Diesel engine started. HorsePower $horsePower")
    }
}