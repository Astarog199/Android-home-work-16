package com.example.androidhw16.Data

import android.util.Log
import com.example.androidhw16.entity.UsefulActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/*
  Реализуйте в UsefulActivityRepository получение данных из API, как вы
  это делали в модуле по работе с сетью. Для десериализации данных
  используется UsefulActivityDto.
 */
class UsefulActivitiesRepository {
    private var _usefulActivityDto: UsefulActivityDto? = null
    private val usefulActivityDto get() = _usefulActivityDto!!

    fun someMethod(){
        RetrofitInstance.jobAPI.getJob().enqueue(object : Callback<UsefulActivityDto> {
            override fun onResponse(call: Call<UsefulActivityDto>, response: Response<UsefulActivityDto>
            ) {
                if (response.isSuccessful){
                    _usefulActivityDto = response.body() ?: return
                }
            }
            override fun onFailure(call: Call<UsefulActivityDto>, t: Throwable) {
                Log.e("Network", "Something went wrong", t)
            }
        })
    }

    fun getUsefulActivity() : UsefulActivity {
        someMethod()
        return usefulActivityDto
        }
    }