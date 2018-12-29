package com.anwesh.uiprojects.linkedmarklinesstepview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.anwesh.uiprojects.marklinesstepview.MarkLinesStepView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view : MarkLinesStepView = MarkLinesStepView.create(this)
        fullScreen()
    }

    fun MainActivity.fullScreen() {
        supportActionBar?.hide()
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }
}
