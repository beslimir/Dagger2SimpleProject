package com.example.dagger2_again.dagger2

import com.example.dagger2_again.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DriverModule {

    companion object {

        @Singleton
        @Provides
        fun provideDriver(): Driver {
            return Driver()
        }

    }

}