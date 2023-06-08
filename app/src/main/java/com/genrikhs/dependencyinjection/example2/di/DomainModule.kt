package com.genrikhs.dependencyinjection.example2.di

import com.genrikhs.dependencyinjection.example2.data.repository.ExampleRepositoryImpl
import com.genrikhs.dependencyinjection.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {

    @Binds
    fun bindExampleRepository(
        emp: ExampleRepositoryImpl
    ): ExampleRepository
}