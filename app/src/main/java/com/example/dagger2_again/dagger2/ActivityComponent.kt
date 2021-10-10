package com.example.dagger2_again.dagger2

import com.example.dagger2_again.MainActivity
import com.example.dagger2_again.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

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
 * create two carComponent instances, we would also get different drivers...
 *
 * Changed @Singleton to @PerActivity, and this will from now on be the ActivityComponent
 * because we want to change the car as soon as we get a new instance of the activity.
 * We will create an AppComponent for the lifetime of the application, e.g. for the Driver.
 *
 * Added AppComponent as a dependency in order to know how to get the Driver. Also, add the appComponent()
 * method to ComponentBuilder in order to use it while instantiating.
 * **/

@PerActivity
@Component(dependencies = [AppComponent::class], modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun appComponent(component: AppComponent): Builder

        fun build(): ActivityComponent



    }
}