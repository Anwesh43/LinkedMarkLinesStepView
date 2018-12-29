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

fun Int.inverse() : Float = 1f / this

fun Float.maxScale(i : Int, n : Int) : Float = Math.max(0f, this - i / n)

fun Float.divideScale(i : Int, n : Int) = Math.min(n.inverse(), maxScale(i, n)) * n

fun Float.scaleFactor() : Float = Math.floor(this / scDiv).toFloat()

fun Float.mirrorValue(a : Int, b : Int) : Float = (1 - scaleFactor()) * a.inverse() + scaleFactor() * b.inverse()

fun Float.updateScale(dir : Float, a : Int, b : Int) : Float = mirrorValue(a, b) * dir * scGap

fun Canvas.drawMLSNode(i : Int, scale : Float, paint : Paint) {
    val w : Float = width.toFloat()
    val h : Float = height.toFloat()
    val gap : Float = w / (nodes + 1)
    val size : Float = gap / sizeFactor
    val sc1 : Float = scale.divideScale(0, 2)
    val sc2 : Float = scale.divideScale(1, 2)
    val xGap : Float = size / ((lines + 1)/2)
    paint.color = foreColor
    paint.strokeWidth = Math.min(w, h) / strokeFactor
    paint.strokeCap = Paint.Cap.ROUND
    save()
    translate(gap * (i + 1), h/2)
    rotate(-90f * sc1)
    translate(-size, -size)
    drawLine(0f, 0f, 0f, 2 * size, paint)
    for (j in 0..(lines - 1)) {
        var newJ : Int = j + 1
        newJ = Math.min(lines - newJ, newJ)
        val sc : Float = sc1.divideScale(j, lines)
        val x : Float = newJ * xGap * sc
        drawLine(0f, 0f, x, 0f, paint)
    }
    restore()
}

class MarkLinesStepView(ctx : Context) : View(ctx)  {

    private val paint : Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas : Canvas) {

    }

    override fun onTouchEvent(event : MotionEvent) : Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
        }
        return true
    }


}