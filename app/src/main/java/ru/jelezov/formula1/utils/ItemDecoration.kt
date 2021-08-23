package ru.jelezov.formula1.utils

import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ItemDecoration(
    private val alterBackground: Drawable,
    private val mainBackground: Drawable
) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State
    ) {
        val position = parent.getChildAdapterPosition(view)
            .let { if (it == RecyclerView.NO_POSITION) return else it }
        view.background = if (position % 2 == 1) alterBackground else mainBackground

    }

}