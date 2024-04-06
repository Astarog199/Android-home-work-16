package com.example.androidhw16.Presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidhw16.Domain.GetUsefulActivityUseCase
import com.example.androidhw16.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn.setOnClickListener {
            val useCase = GetUsefulActivityUseCase()
            binding.text.text = useCase.execute().activity
        }
    }
}