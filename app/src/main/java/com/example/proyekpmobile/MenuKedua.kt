package com.example.proyekpmobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.content.ContentValues.TAG
import android.content.Intent
import android.util.Log

class MenuKedua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_kedua)

        Log.d(TAG,"Ini ada di Menu Pick Up")
    }
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Ini ada di onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Ini ada di onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Ini ada di onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Ini ada di onDestroy")
    }
}