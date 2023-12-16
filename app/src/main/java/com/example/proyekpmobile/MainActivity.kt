package com.example.proyekpmobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.content.ContentValues.TAG
import android.content.Intent
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Ini ada di Menu Utama")
    }

    fun openMenuPertama(view: View) {
        val intent = Intent(this, MenuPertama::class.java)
        startActivity(intent)
    }

    fun openMenuKedua(view: View) {
        val intent = Intent(this, MenuKedua::class.java)
        startActivity(intent)
    }

    fun openMenuKetiga(view: View) {
        val intent = Intent(this, MapsActivity::class.java)
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