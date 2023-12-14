package com.example.mylibrary;

import android.content.Context;

public class SecondClass {
    public String getDeviceType(Context context){
        try {
            String deviceType;
            if (isTablet(context)) {
                deviceType = "Android Tab";
            } else {
                deviceType = "Android Phone";
            }

            return deviceType;
        } catch (Exception var2) {
            return "Android Phone";
        }
    }

    static boolean isTablet(Context context) {
        try {
            boolean xlarge = (context.getResources().getConfiguration().screenLayout & 15) == 4;
            boolean large = (context.getResources().getConfiguration().screenLayout & 15) == 3;
            return xlarge || large;
        } catch (Exception var3) {
            return false;
        }
    }
}
