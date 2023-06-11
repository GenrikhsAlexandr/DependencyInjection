package com.genrikhs.dependencyinjection.example2

import android.app.Application
import com.genrikhs.dependencyinjection.example2.di.DaggerApplicationComponent

class ExampleApp:Application() {

     val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }

}