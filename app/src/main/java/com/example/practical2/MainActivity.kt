package com.example.practical2

import android.os.Bundle

import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate called")
        showToast("onCreate called")
        showSnackbar("onCreate called")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
        showToast("onStart called")
        showSnackbar("onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume called")
        showToast("onResume called")
        showSnackbar("onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause called")
        showToast("onPause called")
        showSnackbar("onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop called")
        showToast("onStop called")

        showSnackbar("onStop called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called")
        showToast("onDestroy called")
        showSnackbar("onDestroy called")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart called")
        showToast("onRestart called")
        showSnackbar("onRestart called")
    }
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    private fun showSnackbar(message: String) {
        Snackbar.make(findViewById(R.id.main), message, Snackbar.LENGTH_SHORT).show()
    }
}