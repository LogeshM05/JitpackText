package com.example.jitpacktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mylibrary.LibraryClass

class MainActivity : AppCompatActivity() {
    var a = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dId = LibraryClass().getDeviceId(applicationContext)
        Log.e("DID", dId)


    }

}