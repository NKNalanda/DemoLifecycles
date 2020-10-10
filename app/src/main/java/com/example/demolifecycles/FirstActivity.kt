package com.example.demolifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Log.e(TAG, "First-> Inside onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "First-> Inside onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "First-> Inside onResume()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "First-> Inside onRestart()")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "First-> Inside onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "First-> Inside onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "First-> Inside onDestroy()")
    }

    companion object{
        private const val TAG = "FirstActivity"
    }

    fun goToNextScreen(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}