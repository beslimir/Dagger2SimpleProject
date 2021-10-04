package com.example.dagger2_again.dagger2

import com.example.dagger2_again.car.Engine
import com.example.dagger2_again.car.DieselEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

/** The variable 'horsePower' is known at the runtime, so we pass it through the constructor.
 * And since the method is dependable on an instance variable, we can't make it static. **/

@Module
/*abstract*/ class DieselEngineModule constructor(var horsePower: Int) {

    @Provides
    fun provideDieselEngine(): Engine {
        return DieselEngine(horsePower)
    }

//    @Binds
//    abstract fun bindDieselEngine(dieselEngine: DieselEngine): Engine

}