package com.example.transitionanimationsts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.fragment_first.view.*

class MainActivity : AppCompatActivity(), AnimationListener {

    private var backPressed = 0L

    ////Example code for view item animation
//    private lateinit var inAnimation: Animation
//    private lateinit var outAnimation: Animation
    ////

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ////Example code for view item animation
//        inAnimation =
//            AnimationUtils.loadAnimation(this, R.anim.alpha_in)
//        outAnimation =
//            AnimationUtils.loadAnimation(this, R.anim.alpha_out)
//        outAnimation.setAnimationListener(this)
//        view.btnTextAnim.setOnClickListener {
//            view.tvFirst.startAnimation(outAnimation)
//        }
        ////

        setupActionBarWithNavController(findNavController(R.id.fragmentContainer))

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragmentContainer)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        if (backPressed + 2000 > System.currentTimeMillis()){
            super.onBackPressed()
        } else {
            Toast.makeText(this, "Press back pressed", Toast.LENGTH_SHORT)
        }
        backPressed = System.currentTimeMillis()
    }

    ////Example code for view item animation
    fun getAnim() {
//        view?.tvFirst?.startAnimation(inAnimation)
    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
        getAnim()
    }

    override fun onAnimationRepeat(p0: Animation?) {

    }
    ////

}