package com.example.jitpacktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var a = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        a = add1(5,10) as Int;

    }

    private fun add1(i: Int, i1: Int): Any {

        Log.e("added value", a.toString())

        return TODO("Provide the return value")
    }
}