package com.genrikhs.dependencyinjection.example2.di

import com.genrikhs.dependencyinjection.example2.data.datasource.ExampleLocalDataSource
import com.genrikhs.dependencyinjection.example2.data.datasource.ExampleLocalDataSourceImpl
import com.genrikhs.dependencyinjection.example2.data.datasource.ExampleRemoteDataSource
import com.genrikhs.dependencyinjection.example2.data.datasource.ExampleRemoteDataSourceImpl
import com.genrikhs.dependencyinjection.example2.data.datasource.TestRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindExampleLocalDataSource(
        impl: ExampleLocalDataSourceImpl
    ): ExampleLocalDataSource

    @ProQualifier
    @ApplicationScope
    @Binds
    fun bindExampleRemoteDataSource(
        impl: ExampleRemoteDataSourceImpl
    ): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(
        impl: TestRemoteDataSourceImpl
    ): ExampleRemoteDataSource
}