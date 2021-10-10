package com.example.dagger2_again.dagger2

import com.example.dagger2_again.car.Driver
import dagger.Module
import dagger.Provides

@Module
abstract class DriverModule {

    companion object {

        @PerApplication
        @Provides
        fun provideDriver(): Driver {
            return Driver()
        }

    }

}