package com.example.mylibrary;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DataClass {

    private String response;
    private int responseCode;

    public DataClass(String response, int responseCode) {
        this.response = response;
        this.responseCode = responseCode;
    }

    public DataClass() {
    }

    public String getResponse() {
        return response;
    }

    public String getFieldTrackValue() throws JSONException {
        JSONObject jsonObject = new JSONObject(response);
        return jsonObject.optString("fieldCapture");
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
}
