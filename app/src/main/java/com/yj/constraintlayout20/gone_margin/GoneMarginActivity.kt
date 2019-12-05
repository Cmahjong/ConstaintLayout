package com.yj.constraintlayout20.gone_margin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yj.constraintlayout20.R
import com.yj.constraintlayout20.extension.onClick
import kotlinx.android.synthetic.main.activity_gone_margin.*

class GoneMarginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gone_margin)
        button.onClick{
            textView5.visibility=View.VISIBLE
        }
        button5.onClick{
            textView5.visibility=View.GONE
        }
    }
}


