package com.anwesh.uiprojects.linkedmarklinesstepview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.marklinesstepview.MarkLinesStepView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view : MarkLinesStepView = MarkLinesStepView.create(this)
    }
}
