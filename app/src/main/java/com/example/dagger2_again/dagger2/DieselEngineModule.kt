package com.example.dagger2_again.dagger2

import com.example.dagger2_again.car.Engine
import com.example.dagger2_again.car.DieselEngine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

//    @Provides
//    fun provideDieselEngine(dieselEngine: DieselEngine): Engine {
//        return dieselEngine
//    }

    @Binds
    abstract fun bindDieselEngine(dieselEngine: DieselEngine): Engine

}