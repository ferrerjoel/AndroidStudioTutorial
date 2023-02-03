package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        veurevariables()
    }

    private fun veurevariables()
    {
        var variable1 =" Pepe"
        Log.d("TAG::", variable1)
    }

}