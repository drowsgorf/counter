package com.heavin.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var counterButton: Button
    private lateinit var counterText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterButton = findViewById(R.id.counter_button)
        counterText = findViewById(R.id.textView)

        class Counter {
            private var count: Int = 0

            fun addCount() {
                count++
            }

            fun getCount(): Int {
                return count
            }
        }

        var count = Counter()

        counterButton.setOnClickListener{ view: View ->
            count.addCount()

            counterText.setText(count.getCount().toString())
        }

    }
}