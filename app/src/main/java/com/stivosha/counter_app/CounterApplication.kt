package com.stivosha.counter_app

import android.app.Application
import com.stivosha.counter_app.di.SimpleDi

class CounterApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        SimpleDi.init(this)
    }
}