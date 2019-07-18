package com.yj.constraintlayout20.layer

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yj.constraintlayout20.R
import kotlinx.android.synthetic.main.activity_layer.*

class LayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layer)
        button6.setOnClickListener {
            val valueAnimator = ValueAnimator.ofFloat(0F, 360F)
            valueAnimator.duration = 300
            valueAnimator.addUpdateListener {
                val value = it.animatedValue as Float
                layer.rotation = value
                layer.scaleX = 1 + (180 - Math.abs(value - 180)) / 20f
                layer.scaleY = 1 + (180 - Math.abs(value - 180)) / 20f
                var shift_x = 500 * Math.sin(Math.toRadians((value * 5).toDouble())).toFloat()
                var shift_y = 500 * Math.sin(Math.toRadians((value * 7).toDouble())).toFloat()
                layer.translationX = shift_x
                layer.translationY = shift_y
            }
            valueAnimator.duration = 4000
            valueAnimator.start()
        }

    }
}
