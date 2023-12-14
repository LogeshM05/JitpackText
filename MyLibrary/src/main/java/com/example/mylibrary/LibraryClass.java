package com.example.mylibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;

import java.util.Random;

public class LibraryClass {

    private String imageUri = "";

    public String getDeviceId(Context context){
        @SuppressLint("HardwareIds") String deviceId = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        return deviceId;
    }
    public void sample(){
        int min = 65;
        int max = 80;
        Random r = new Random();
        int randomNumber = r.nextInt(max - min + 1) + min;
        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
    }
}
