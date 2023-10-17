package com.example.mad_practical_9_21012011129

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.mad_practical_9_21012011129.R
import android.widget.ImageView

class SplashActivity : AppCompatActivity(),Animation.AnimationListener {
    lateinit var imageAnimation : AnimationDrawable
    lateinit var logoimage:ImageView
    lateinit var logoanimation : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        logoimage=findViewById(R.id.uvpce)
        logoimage.setBackgroundResource(R.drawable.logo_animation_list)
        imageAnimation = logoimage.background as AnimationDrawable
        logoimage.setBackgroundResource((R.drawable.uvpce_logo))
        logoanimation=AnimationUtils.loadAnimation(this,R.anim.twin_animation)
        logoanimation.setAnimationListener(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus)
        {
            imageAnimation.start()
            logoimage.startAnimation(logoanimation)
        }
        else
        {
            imageAnimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }

    override fun onAnimationStart(p0: Animation?) {


    }

    override fun onAnimationEnd(p0: Animation?) {
        //intent use to open animation
    }

    override fun onAnimationRepeat(p0: Animation?) {

    }
}