package com.example.dagger2_again

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2_again.car.Car
import com.example.dagger2_again.dagger2.ActivityComponent
import javax.inject.Inject


/** The DaggerCarComponent.create() is only possible if there are no parameters in the constructor in
 * any of our modules. Otherwise, we use .builder() and add the property .dieselEngineModule() - our
 * module which has a parameter in the constructor
 *
 * If we want to use ComponentBuilder annotation with dieselEngine, we need to pass the variables to the constructor
 * and use the @Binds method fun the module, and also make them abstract.
 *
 * With .appComponent() we connect AppComponent and ActivityComponent
 * **/

class MainActivity : AppCompatActivity() {

    //    private lateinit var car: Car
    @Inject
    lateinit var car1: Car //field injection
    @Inject
    lateinit var car2: Car //field injection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val carComponent = DaggerCarComponent.create()

        /* For diesel engine (Remove @Component.Builder from CarComponent) */
//        val carComponent = DaggerCarComponent.builder()
//            .dieselEngineModule(DieselEngineModule(105))
//            .build()

        /* For petrol engine */
//        val carComponent = DaggerCarComponent.builder()
//            .horsePower(105)
//            .engineCapacity(1600)
//            .build()

        /* Get component from .App class */
//        val carComponent = (application as App).getAppComponent()
//        val component = DaggerActivityComponent.builder()
//            .horsePower(105)
//            .engineCapacity(1600)
//            .appComponent((application as App).getAppComponent())
//            .build()

        /* Using subcomponents and diesel engine module */
//        val component: ActivityComponent = (application as App).getAppComponent()
//            .getActivityComponent(DieselEngineModule(105))

        /* Using subcomponents and petrol engine through SubcomponentBuilder */
        val component: ActivityComponent = (application as App).getAppComponent()
            .getActivityComponentBuilder()
            .horsePower(105)
            .engineCapacity(1600)
            .build()

        component.inject(this)

//        car = carComponent.getCar()
//        carComponent.inject(this)
        car1.drive()
        car2.drive()
    }
}