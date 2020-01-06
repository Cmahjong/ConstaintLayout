package com.yj.constraintlayout20.motion_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout
import com.yj.constraintlayout20.R

class MotionLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_layout)
        val motionContent = findViewById<MotionLayout>(R.id.motion_content)
        findViewById<View>(R.id.bt_to_end).setOnClickListener {
            motionContent.transitionToEnd()
        }
        findViewById<View>(R.id.bt_to_start).setOnClickListener {
            motionContent.transitionToStart()
        }
    }
}
