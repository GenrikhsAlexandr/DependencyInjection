package com.genrikhs.dependencyinjection.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.genrikhs.dependencyinjection.databinding.ActivityMainBinding
import com.genrikhs.dependencyinjection.example2.di.DaggerApplicationComponent
import java.lang.System.currentTimeMillis
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    //first way
    /*   private val component by lazy {
           DaggerApplicationComponent.builder()
               .context(application)
               .milliSeconds(currentTimeMillis())
               .build()
       }*/

    //second way
    private val component by lazy {
        DaggerApplicationComponent.factory()
            .create(application, currentTimeMillis())
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component.inject(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.method()
    }
}