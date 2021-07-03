package com.example.responsi_124190054.service.cases;

import com.google.gson.annotations.SerializedName;

public class Case {
    @SerializedName("status_code")
    private int statusCode;

    @SerializedName("data")
    private Data data;

    public int getStatusCode(){
        return statusCode;
    }

    public Data getData(){
        return data;
    }
}
