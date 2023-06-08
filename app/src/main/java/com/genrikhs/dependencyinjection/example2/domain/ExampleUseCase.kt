package com.genrikhs.dependencyinjection.example2.domain

import javax.inject.Inject

class ExampleUseCase @Inject constructor(
    private val repository: ExampleRepository
) {
    operator fun invoke() {
        repository.method()
    }
}