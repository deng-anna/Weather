package com.weather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class WeatherApplication : Application() {
    companion object {
        const val TOKEN = "AQSFFykgM8EfOkxJ"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}