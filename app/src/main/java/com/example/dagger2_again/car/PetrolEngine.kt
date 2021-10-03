package com.example.dagger2_again.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(): Engine {

    override fun startEngine() {
        Log.d("TAG", "Petrol engine started")
    }
}