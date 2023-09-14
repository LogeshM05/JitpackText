package com.example.mylibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;

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
                SharedPref.getInstance().setSharedValue(context, "sharedAPIKey", user);
            } else {
                user = "";
                Toast.makeText(context, "Please add your SDK API KEY", 1).show();
            }

            return user;
        } catch (Exception var2) {
            return "";
        }
    }
}
