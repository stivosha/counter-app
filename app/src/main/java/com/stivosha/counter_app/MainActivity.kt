package com.stivosha.counter_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.stivosha.counter_app.SecondActivity.Companion.SQUARE_NUM_EXTRAS
import com.stivosha.counter_app.di.SimpleDi.logger

class MainActivity : AppCompatActivity() {

    private lateinit var numTextView: TextView
    private lateinit var startSecondActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        numTextView.text = (savedInstanceState?.getInt(NUM_EXTRAS) ?: 0).toString()
        startSecondActivityButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra(SQUARE_NUM_EXTRAS, numTextView.text.toString().toInt())
            }
            startActivity(intent)
        }
    }

    private fun initViews(){
        numTextView = findViewById(R.id.main_activity_num_text_view)
        startSecondActivityButton = findViewById(R.id.start_second_activity_button)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(NUM_EXTRAS, numTextView.text.toString().toInt() + 1)
        super.onSaveInstanceState(outState)
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
        const val NUM_EXTRAS: String = "NUM_EXTRAS"
    }
}