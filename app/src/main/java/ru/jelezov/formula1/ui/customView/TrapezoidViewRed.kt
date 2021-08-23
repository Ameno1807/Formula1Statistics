package ru.jelezov.formula1.ui.customView

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.drawable.shapes.PathShape

import android.graphics.drawable.ShapeDrawable
import android.util.AttributeSet
import android.view.View


class TrapezoidViewRed(context: Context?, attrs: AttributeSet?) :
    View(context, attrs) {
    private val mTrapezoid: ShapeDrawable
    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        mTrapezoid.setBounds(0, 0, w, h)
    }

     override fun onDraw(canvas: Canvas?) {
        if (canvas != null) {
            mTrapezoid.draw(canvas)
        }
    }

    init {
        val path = Path()
        path.moveTo(0.0f, 0.0f)
        path.lineTo(100.0f, 0.0f)
        path.lineTo(200.0f, 100.0f)
        path.lineTo(0.0f, 100.0f)
        path.lineTo(0.0f, 0.0f)
        mTrapezoid = ShapeDrawable(PathShape(path, 200.0f, 100.0f))
        mTrapezoid.paint.style = Paint.Style.FILL_AND_STROKE
        mTrapezoid.paint.strokeWidth = 1.0f
        mTrapezoid.paint.color = Color.parseColor("#D50000")
    }
}