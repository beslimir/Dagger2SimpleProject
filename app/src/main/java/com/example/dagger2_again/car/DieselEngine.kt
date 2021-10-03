package com.example.dagger2_again.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(): Engine {

    override fun startEngine() {
        Log.d("TAG", "Diesel engine started")
    }
}