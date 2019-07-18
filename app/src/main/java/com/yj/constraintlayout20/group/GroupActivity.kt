package com.yj.constraintlayout20.group

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yj.constraintlayout20.R
import kotlinx.android.synthetic.main.activity_group.*

class GroupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group)
        bt_show.setOnClickListener {
            group.visibility = View.VISIBLE
        }
        bt_hide.setOnClickListener {
            group.visibility = View.GONE
        }

    }
}
