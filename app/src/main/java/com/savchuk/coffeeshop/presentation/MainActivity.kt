package com.savchuk.coffeeshop.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.savchuk.andrew.home.presentation.screens.HomeFragment
import com.savchuk.coffeeshop.R
import com.savchuk.coffeeshop.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, HomeFragment())
                .commit()
        }
    }
}