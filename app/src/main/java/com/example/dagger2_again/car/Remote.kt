package com.example.dagger2_again.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    fun setListener(car: Car) {
        Log.d("TAG", "Remote connected")
    }

}