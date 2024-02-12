package com.stivosha.counter_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.stivosha.counter_app.di.SimpleDi
import com.stivosha.counter_app.di.SimpleDi.logger

class SecondActivity : AppCompatActivity() {

    private lateinit var numTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val num = intent.extras?.getInt(SQUARE_NUM_EXTRAS) ?: 0
        initViews()
        numTextView.text = (num * num).toString()
    }

    private fun initViews() {
        numTextView = findViewById(R.id.second_activity_num_text_view)
    }

    override fun onStart() {
        super.onStart()
        logger?.writeInLog(this.localClassName + " onStart")
    }

    override fun onResume() {
        super.onResume()
        logger?.writeInLog(this.localClassName + " onResume")

    }

    override fun onPause() {
        super.onPause()
        logger?.writeInLog(this.localClassName + " onPause")
    }

    override fun onStop() {
        super.onStop()
        logger?.writeInLog(this.localClassName + " onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        logger?.writeInLog(this.localClassName + " onDestroy")
    }

    companion object {
        const val SQUARE_NUM_EXTRAS: String = "SQUARE_NUM_EXTRAS"
    }
}