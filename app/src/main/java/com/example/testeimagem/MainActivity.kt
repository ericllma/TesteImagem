package com.example.testeimagem

import android.annotation.SuppressLint
import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listener = View.OnTouchListener { view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                view.y = (motionEvent.rawY - view.height * 1.5).toFloat()
                view.x = (motionEvent.rawX - view.width / 1.5).toFloat()
            }

            true

        }

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        clearAllViews.setOnClickListener {
            framelayout.removeAllViews()
        }

        img_1.setOnClickListener {
            var img1: ImageView
            img1 = ImageView(this)
            img1.setImageResource(R.drawable.img_1)
            framelayout.addView(img1)

            img1.layoutParams.height = 200
            img1.layoutParams.width = 200
            img1.x = 10F * (1..45).random()
            img1.y = 10F * (1..85).random()
            img1.setOnTouchListener(listener)
        }

        img_2.setOnClickListener {
            var img2: ImageView
            img2 = ImageView(this)
            img2.setImageResource(R.drawable.img_2)
            framelayout.addView(img2)

            img2.layoutParams.height = 150
            img_2.layoutParams.width = 100
            img2.x = 10F * (-20..20).random()
            img2.y = 10F * (1..85).random()
            img2.setOnTouchListener(listener)
        }

        img_3.setOnClickListener {
            var img3: ImageView
            img3 = ImageView(this)
            img3.setImageResource(R.drawable.img_3)
            framelayout.addView(img3)

            img3.layoutParams.height = 150
            img_3.layoutParams.width = 100
            img3.x = 10F * (-20..20).random()
            img3.y = 10F * (1..85).random()
            img3.setOnTouchListener(listener)
        }

        img_4.setOnClickListener {
            var img4: ImageView
            img4 = ImageView(this)
            img4.setImageResource(R.drawable.img_4)
            framelayout.addView(img4)

            img4.layoutParams.height = 150
            img_4.layoutParams.width = 150
            img4.x = 10F * (-20..20).random()
            img4.y = 10F * (1..85).random()
            img4.setOnTouchListener(listener)
        }

        img_5.setOnClickListener {
            var img5: ImageView
            img5 = ImageView(this)
            img5.setImageResource(R.drawable.img_5)
            framelayout.addView(img5)

            img5.layoutParams.height = 150
            img_5.layoutParams.width = 120
            img5.x = 10F * (-20..20).random()
            img5.y = 10F * (1..85).random()
            img5.setOnTouchListener(listener)
        }

        img_6.setOnClickListener {
            var img6: ImageView
            img6= ImageView(this)
            img6.setImageResource(R.drawable.img_6)
            framelayout.addView(img6)

            img6.layoutParams.height = 150
            img_5.layoutParams.width = 120
            img6.x = 10F * (-20..20).random()
            img6.y = 10F * (1..85).random()
            img6.setOnTouchListener(listener)
        }

        img_7.setOnClickListener {
            var img7: ImageView
            img7 = ImageView(this)
            img7.setImageResource(R.drawable.img_7)
            framelayout.addView(img7)

            img7.layoutParams.height = 150
            img7.layoutParams.width = 120
            img7.x = 10F * (20..40).random()
            img7.y = 10F * (1..85).random()
            img7.setOnTouchListener(listener)
        }






    }




}



