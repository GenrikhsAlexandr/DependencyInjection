package com.genrikhs.dependencyinjection.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.genrikhs.dependencyinjection.databinding.ActivityMainBinding
import com.genrikhs.dependencyinjection.example2.ExampleApp
import com.genrikhs.dependencyinjection.example2.domain.ViewModelFactory
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val viewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel2::class.java]
    }

    //first way
    /*   private val component by lazy {
           DaggerApplicationComponent.builder()
               .context(application)
               .milliSeconds(currentTimeMillis())
               .build()
       }*/

    //second way
    private val component by lazy {
        (application as ExampleApp).component
            .activityComponentFactory()
            .create("MY_ID2", "MY_NAME2")
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component.inject(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel2.method()
    }
}