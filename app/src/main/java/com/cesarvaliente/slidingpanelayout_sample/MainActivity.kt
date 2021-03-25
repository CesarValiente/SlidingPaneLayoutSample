package com.cesarvaliente.slidingpanelayout_sample

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.slidingpanelayout.widget.SlidingPaneLayout

class MainActivity : AppCompatActivity() {
    private val TAG = "SLIDEPANE"
    lateinit var sidePane: SlidingPaneLayout
    lateinit var open: Button
    //lateinit var close: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sidePane = findViewById<SlidingPaneLayout>(R.id.sliding_pane_layout)
        open = findViewById<Button>(R.id.side_open)
        //close = findViewById<Button>(R.id.side_close)

        open.setOnClickListener { sidePane.open() }
        //close.setOnClickListener { sidePane.close() }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if (sidePane.isSlideable)
        {
            Log.i(TAG, "sidePane.isSlideable")
        }
        else
        {
            Log.i(TAG, "NOT sidePane.isSlideable")
        }
    }
}