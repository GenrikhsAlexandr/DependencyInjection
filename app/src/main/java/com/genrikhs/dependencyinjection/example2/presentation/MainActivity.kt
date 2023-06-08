package com.genrikhs.dependencyinjection.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.genrikhs.dependencyinjection.databinding.ActivityMainBinding
import com.genrikhs.dependencyinjection.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component = DaggerApplicationComponent.create()


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.method()


    }
}