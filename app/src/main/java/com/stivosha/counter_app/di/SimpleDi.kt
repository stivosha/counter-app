package com.stivosha.counter_app.di

import android.content.Context

object SimpleDi {
    var logger: ConsoleLogger? = null
    fun init(context: Context) {
        logger = ConsoleLogger(context)
    }
}