package com.example.android.pictureinpicture

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager

class PipTestActivity : AppCompatActivity() {

    private val TAG = this.javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pip_test)
        init()
    }

    fun init() {
        val f = FirstFragment()
        val fragmentManager = supportFragmentManager
        if (fragmentManager.backStackEntryCount != 0) {
            fragmentManager.popBackStack(
                null,
                FragmentManager.POP_BACK_STACK_INCLUSIVE
            )
        }
        val fmt =
            fragmentManager.beginTransaction().replace(R.id.flContent, f)
        fmt.commitAllowingStateLoss()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }
}