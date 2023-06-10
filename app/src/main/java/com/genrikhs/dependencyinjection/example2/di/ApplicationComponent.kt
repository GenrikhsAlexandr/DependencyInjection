package com.genrikhs.dependencyinjection.example2.di

import android.content.Context
import com.genrikhs.dependencyinjection.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)


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
    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance milliSeconds: Long
        ): ApplicationComponent
    }
}