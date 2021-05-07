package com.cesarvaliente.slidingpanelayout_sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ContentPaneFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.content_pane, container, false)
        val close = view.findViewById<Button>(R.id.side_close)
        close.setOnClickListener { (activity as MainActivity).slidingPane.close() }
        return view
    }
}