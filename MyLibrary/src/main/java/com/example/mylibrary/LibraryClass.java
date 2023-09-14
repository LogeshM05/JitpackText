package com.example.mylibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

public class LibraryClass {

    private String imageUri = "";

    public String getDeviceId(Context context){
        @SuppressLint("HardwareIds") String deviceId = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        return deviceId;
    }
    public static String getAppKey(Context context) {
        try {
            String user = getMetadata(context, "resulticks.key");
            if (user == null) {
                user = getMetadata(context, "sdk.key");
            }

            if (user != null) {
                user = user.replace("api_key_", "");
                Log.e("user", user);
            } else {
                user = "";
                Toast.makeText(context, "Please add your SDK API KEY", Toast.LENGTH_SHORT).show();
            }

            return user;
        } catch (Exception var2) {
            return "";
        }
    }

    private static String getMetadata(Context context, String name) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            return applicationInfo.metaData != null && applicationInfo.metaData.containsKey(name) ? applicationInfo.metaData.getString(name, (String)null) : null;
        } catch (Exception var3) {
            ExceptionTracker.track(var3);
            return null;
        }
    }
}
