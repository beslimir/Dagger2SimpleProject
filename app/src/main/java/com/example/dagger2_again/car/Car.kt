package com.example.dagger2_again.car

import android.util.Log
import com.example.dagger2_again.dagger2.PerActivity
import javax.inject.Inject

/** This is our main part. We want to produce a car and we need an engine and wheels to do that!
 * So we put them in the constructor and inject.
 * in fun drive() we call a method to start the engine and we do it from the MainActivity.
 * The fun enableRemote() is an injected method from Remote class.
 * If the constructor injects, after it the fields and then methods automatically!
 *
 * If we want to have a single instance of a car, we can make a custom annotation scope, @PerActivity,
 * and the car object will be alive as long as our activity is.
 * **/

@PerActivity
class Car @Inject constructor(var driver: Driver, var engine: Engine, wheels: Wheels) {

    fun drive() {
        engine.startEngine()
        Log.d("TAG", "$driver driving... $this")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

}