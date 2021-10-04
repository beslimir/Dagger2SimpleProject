package com.example.dagger2_again.dagger2

import com.example.dagger2_again.car.Engine
import com.example.dagger2_again.car.DieselEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

/** The variable 'horsePower' is known at the runtime, so we pass it through the constructor.
 * And since the method is dependable on an instance variable, we can't make it static.
 * If we want to get access for the horsePower variable in other places, we can make
 * a @Provides method in order to return it, and also for the @Provides dieselEngine method
 * we can pass the dieselEngine instance as a parameter and return it, and Dagger knows where
 * can he get the horsePower from. **/

@Module
/*abstract*/ class DieselEngineModule constructor(var horsePower: Int) {

    @Provides
    fun provideDieselEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

//    @Binds
//    abstract fun bindDieselEngine(dieselEngine: DieselEngine): Engine

}