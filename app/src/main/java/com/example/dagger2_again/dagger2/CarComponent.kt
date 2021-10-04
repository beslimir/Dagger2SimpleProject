package com.example.dagger2_again.dagger2

import com.example.dagger2_again.MainActivity
import com.example.dagger2_again.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

/** We need this Component interface in order to produce Cars.
 * We can use the first function, getCar(), and call it from MainActivity.
 * The other way is to create an inject() function, and to call it in MainActivity, so all parts
 * of the Car class would Inject automatically after the constructor finishes (fields and methods).
 *
 * If we want to do for the PetrolEngine like we did for diesel, but in a more efficient way,
 * we can create our ComponentBuilder with the annotation, and create a method
 * which will be used in the MainActivity on the builder.
 *
 * The @Singleton annotation works just in the same component. If we would in the MainActivity
 * create two carComponent instances, we would also get different drivers... **/

@Singleton
@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun build(): CarComponent



    }
}