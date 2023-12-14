package com.example.jitpacktest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibrary.LibraryClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val dId = LibraryClass().getDeviceId(applicationContext)
//        Log.e("DID", dId)

    }

}