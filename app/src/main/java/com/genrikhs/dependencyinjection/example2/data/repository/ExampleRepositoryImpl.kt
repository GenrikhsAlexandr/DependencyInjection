package com.genrikhs.dependencyinjection.example2.data.repository

import com.genrikhs.dependencyinjection.example2.data.datasource.ExampleLocalDataSource
import com.genrikhs.dependencyinjection.example2.data.datasource.ExampleRemoteDataSource
import com.genrikhs.dependencyinjection.example2.data.mapper.ExampleMapper
import com.genrikhs.dependencyinjection.example2.di.ApplicationScope
import com.genrikhs.dependencyinjection.example2.di.ProQualifier
import com.genrikhs.dependencyinjection.example2.di.TestQualifier
import com.genrikhs.dependencyinjection.example2.domain.ExampleRepository
import javax.inject.Inject


class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @TestQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}