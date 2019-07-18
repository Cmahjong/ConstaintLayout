package com.yj.constraintlayout20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yj.constraintlayout20.barrier.BarrierActivity
import com.yj.constraintlayout20.group.GroupActivity
import com.yj.constraintlayout20.layer.LayerActivity
import com.yj.constraintlayout20.layer.SelfLayerActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_group.setOnClickListener {
            startActivity(Intent(this,GroupActivity::class.java))
        }
        tv_barrier.setOnClickListener {
            startActivity(Intent(this, BarrierActivity::class.java))
        }
        tv_layer.setOnClickListener {
            startActivity(Intent(this, LayerActivity::class.java))
        }
        tv_self_layer.setOnClickListener {
            startActivity(Intent(this, SelfLayerActivity::class.java))
        }
    }
}
