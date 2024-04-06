package com.example.androidhw16.entity

// Создайте интерфейс UsefulActivity в пакете entity с полями,
//соответствующими json из ответа API.

interface UsefulActivity {
    val activity: String
    val type: String
    val participants: Int
    val price: Double
    val link: String
    val key: String
    val accessibility: Double
}