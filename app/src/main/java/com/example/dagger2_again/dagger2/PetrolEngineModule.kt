package com.example.dagger2_again.dagger2

import com.example.dagger2_again.car.DieselEngine
import com.example.dagger2_again.car.Engine
import com.example.dagger2_again.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

//    @Provides
//    fun provideEngine(petrolEngine: PetrolEngine): Engine {
//        return petrolEngine
//    }

    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine): Engine

}