package com.cesarvaliente.slidingpanelayout_sample

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.slidingpanelayout.widget.SlidingPaneLayout

class MainActivity : AppCompatActivity() {
    private val TAG = "SLIDEPANE"
    lateinit var slidingPane: SlidingPaneLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        slidingPane = findViewById(R.id.sliding_pane_layout)

        val open = findViewById<Button>(R.id.side_open)
        open.setOnClickListener { slidingPane.open() }
    }

    //This function is just to see how the isSlideable() state changes when there is a new configuration change.
    //SlidingPaneLayout can be used without this.
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if (slidingPane.isSlideable) {
            Log.i(TAG, "slidingPane.isSlideable")
        } else {
            Log.i(TAG, "NOT slidingPane.isSlideable")
        }
    }
}