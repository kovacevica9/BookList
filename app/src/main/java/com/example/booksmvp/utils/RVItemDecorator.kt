package com.example.booksmvp.utils

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class RVItemDecorator(
    private val spaceInPixels:Int,
    private val spaceSide:Int,
    private val orintation :Int? = RecyclerView.VERTICAL)
    : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        if (orintation == null){
            outRect.top = spaceInPixels
            outRect.bottom = spaceInPixels
            outRect.right = spaceInPixels
            outRect.left = spaceInPixels
        }else if (orintation == RecyclerView.VERTICAL){
            outRect.bottom = spaceInPixels
            outRect.top = spaceInPixels
            outRect.right = spaceSide
            outRect.left = spaceSide
        }else{
            outRect.left = spaceInPixels
            outRect.right = spaceInPixels
        }
    }
}