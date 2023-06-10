package com.genrikhs.dependencyinjection.example2.data.network

import android.content.Context
import android.util.Log
import android.util.LogPrinter
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
            } $milliSeconds"
        )
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}