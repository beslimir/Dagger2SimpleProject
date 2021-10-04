package com.example.dagger2_again.car

import android.util.Log
import javax.inject.Inject

/** The similar way to the dieselEngine, we can add horsePower variable to the constructor,
 * but the remaining steps are different and more efficient. Look at CarComponent! **/

class PetrolEngine @Inject constructor(var horsePower: Int): Engine {

    override fun startEngine() {
        Log.d("TAG", "Petrol engine started. Horse power: $horsePower")
    }
}