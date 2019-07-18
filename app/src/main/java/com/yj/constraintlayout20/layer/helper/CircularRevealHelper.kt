package com.yj.constraintlayout20.layer.helper

import android.animation.ValueAnimator
import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.ViewAnimationUtils
import androidx.constraintlayout.widget.ConstraintHelper
import androidx.constraintlayout.widget.ConstraintLayout

/**
 * desc:
 * time: 2019/7/18
 * @author 银进
 */
class CircularRevealHelper:ConstraintHelper {
    constructor(context: Context): super(context)

    constructor(context: Context, attrs: AttributeSet): super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun updatePostLayout(container: ConstraintLayout?) {
        super.updatePostLayout(container)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val views = getViews(container)
            for (view in views) {
                val valueAnimator = ValueAnimator.ofFloat(0f, 2f)
                valueAnimator.addUpdateListener {
                    val value = it.animatedValue as Float
                    view.scaleX =value
                    view.scaleY =value
                }
                valueAnimator.duration = 5000
                valueAnimator.start()
            }
        }

    }
}