package com.cesarvaliente.slidingpanelayout_sample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.slidingpanelayout.widget.SlidingPaneLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sidePane = findViewById<SlidingPaneLayout>(R.id.sliding_pane_layout)
        val open = findViewById<Button>(R.id.side_open)
        val close = findViewById<Button>(R.id.side_close)

        open.setOnClickListener { sidePane.open() }
        close.setOnClickListener { sidePane.close() }
    }
}