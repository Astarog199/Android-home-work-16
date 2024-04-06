package com.example.androidhw16.Domain

import com.example.androidhw16.Data.UsefulActivitiesRepository
import com.example.androidhw16.entity.UsefulActivity


/*
Создайте GetUsefulActivityUseCase в пакете domain с методом execute,
возвращающим UsefulActivity

В юзкейсе в конструкторе прокиньте UsefulActivitiesRepository и
получите из него данные в методе execute.
 */

class GetUsefulActivityUseCase {
      private val repository = UsefulActivitiesRepository()

    fun execute(): UsefulActivity {
        return repository.getUsefulActivity()
    }
}