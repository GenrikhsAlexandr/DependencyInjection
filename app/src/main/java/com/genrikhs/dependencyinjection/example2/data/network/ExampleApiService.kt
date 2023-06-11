package com.genrikhs.dependencyinjection.example2.data.network

import android.content.Context
import android.util.Log
import com.genrikhs.dependencyinjection.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val milliSeconds: Long
) {
    fun method() {
        Log.d(
            LOG_TAG, "ExampleApiService ${
                context
                    .getString(R.string.app_name)
            } $milliSeconds $this"
        )
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}