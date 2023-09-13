package com.example.mylibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;

public class LibraryClass {
    @SuppressLint("HardwareIds")
    public String getDeviceId(Context context){
        String deviceId = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        return deviceId;
    }
}
