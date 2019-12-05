package com.yj.constraintlayout20.extension

import android.view.View

/**
 * desc:
 * time: 2019/12/5
 * @author 银进
 */
fun View.onClick(function: ()->Unit) {
    this.setOnClickListener {
        function()
    }
}