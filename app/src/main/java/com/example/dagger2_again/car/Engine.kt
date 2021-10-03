package com.example.dagger2_again.car

/** As this is an interface, we will implement it in the Diesel and Petrol classes,
 * and use a module to decide which engine to use. **/

interface Engine {

    fun startEngine()
}