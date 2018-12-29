package com.anwesh.uiprojects.marklinesstepview

/**
 * Created by anweshmishra on 29/12/18.
 */

import android.view.View
import android.view.MotionEvent
import android.content.Context
import android.app.Activity
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Canvas

val nodes : Int = 5
val lines : Int = 5
val foreColor : Int = Color.parseColor("#4CAF50")
val scGap : Float = 0.05f
val scDiv : Double = 0.51
val backColor : Int = Color.parseColor("#212121")
val DELAY : Long = 25
val strokeFactor : Int = 90
val sizeFactor : Float = 2.6f