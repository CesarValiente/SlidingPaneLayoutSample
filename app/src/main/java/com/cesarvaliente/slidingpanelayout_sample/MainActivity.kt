package com.cesarvaliente.slidingpanelayout_sample

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.slidingpanelayout.widget.SlidingPaneLayout
import com.google.android.material.slider.Slider


class MainActivity : AppCompatActivity() {
    private val TAG = "SLIDEPANE"
    lateinit var slidingPane: SlidingPaneLayout
    lateinit var slidingText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        slidingPane = findViewById(R.id.sliding_pane_layout)

        val open = findViewById<Button>(R.id.side_open)
        open.setOnClickListener { slidingPane.open() }

        slidingText = findViewById<TextView>(R.id.sliding_text)
        //
        val sidePane = findViewById<LinearLayout>(R.id.side_pane_content)
        val slider = findViewById<Slider>(R.id.width_slider)
        slider.addOnChangeListener { slider, value, _ ->
            Log.i(TAG, "new width: " + value)

            val params: ViewGroup.LayoutParams? = sidePane.layoutParams
            params?.width = (value * this.resources.displayMetrics.density).toInt()
            sidePane.layoutParams = params

            Log.i(TAG, "slideable: " + slidingPane.isSlideable)
            slidingText.text = "slideable: " + slidingPane.isSlideable.toString()
        }
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