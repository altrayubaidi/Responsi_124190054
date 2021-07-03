package com.example.responsi_124190054.service.hospital;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hospital {
    @SerializedName("status_code")
    private int statusCode;

    @SerializedName("data")
    private List<HospitalData> data;

    public int getStatusCode() {
        return statusCode;
    }

    public List<HospitalData> getData() {
        return data;
    }
}
