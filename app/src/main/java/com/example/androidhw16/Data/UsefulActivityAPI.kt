package com.example.androidhw16.Data

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://www.boredapi.com"

object RetrofitInstance {
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val jobAPI: JobAPI = retrofit.create(JobAPI::class.java)
}

interface JobAPI {
    @GET("/api/activity/")
    fun getJob(): Call<UsefulActivityDto>
}