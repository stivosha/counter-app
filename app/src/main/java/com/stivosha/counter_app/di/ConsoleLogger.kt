package com.stivosha.counter_app.di

import android.content.Context
import java.io.File

const val FILE_NAME = "logs.txt"

class ConsoleLogger(context: Context) {
    private val file: File

    init {
        val path = context.filesDir
        file = File(path, FILE_NAME)
        if (!file.exists())
            file.createNewFile()
    }

    fun writeInLog(text: String) {
        file.appendText(text + "\n")
    }
}