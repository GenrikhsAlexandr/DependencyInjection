package com.genrikhs.dependencyinjection.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.genrikhs.dependencyinjection.example2.domain.ExampleRepository
import com.genrikhs.dependencyinjection.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
): ViewModel() {
    fun method() {
       repository
        Log.d("ExampleViewModel", "$this")
    }
}