package com.example.demolifecycles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.e(TAG, "Second-> Inside onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "Second-> Inside onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "Second-> Inside onResume()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "Second-> Inside onRestart()")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "Second-> Inside onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "Second-> Inside onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "Second-> Inside onDestroy()")
    }

    companion object{
        private const val TAG = "SecondActivity"
    }

    fun goBack(view: View) {
        onBackPressed()
    }
}