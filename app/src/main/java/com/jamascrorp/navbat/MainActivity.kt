package com.jamascrorp.navbat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jamascrorp.navbat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var viewBinding: ActivityMainBinding? = null
    private val binding get() = viewBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}