package com.genrikhs.dependencyinjection.example2.di

import android.content.Context
import com.genrikhs.dependencyinjection.example2.data.database.ExampleDatabase
import com.genrikhs.dependencyinjection.example2.data.network.ExampleApiService
import com.genrikhs.dependencyinjection.example2.presentation.ExampleViewModel
import com.genrikhs.dependencyinjection.example2.presentation.MainActivity
import com.genrikhs.dependencyinjection.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

/*
    fun getViewModel(): ExampleViewModel

    fun getExampleDatabase(): ExampleDatabase

    fun getExampleApiService(): ExampleApiService

    fun inject(activity: MainActivity)
    fun inject(activity2: MainActivity2)*/

    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface ApplicationComponentFactory {


        fun create(
            @BindsInstance context: Context,
            @BindsInstance milliSeconds: Long
        ): ApplicationComponent
    }


//first way
    /*@Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        @BindsInstance
        fun milliSeconds(milliSeconds: Long): Builder
        fun build(): ApplicationComponent
    }*/

//second way


}