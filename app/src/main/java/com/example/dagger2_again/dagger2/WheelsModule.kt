package com.example.dagger2_again.dagger2

import com.example.dagger2_again.car.Rims
import com.example.dagger2_again.car.Tires
import com.example.dagger2_again.car.Wheels
import dagger.Module
import dagger.Provides

/** As we don't own the classes Wheels, Rims, Tires, we need an Module to provide them
 * (we cant inject their constructors as we don't own them). **/

@Module
class WheelsModule {

    companion object {

        @Provides
        fun provideRims(): Rims {
            return Rims()
        }

        @Provides
        fun provideTires(): Tires {
            val tires = Tires()
            tires.inflate()
            return tires
        }

        @Provides
        fun provideWheels(rims: Rims, tires: Tires): Wheels {
            return Wheels(rims, tires)
        }

    }

}