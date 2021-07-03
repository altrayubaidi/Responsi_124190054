package com.example.responsi_124190054.service.cases;

import com.google.gson.annotations.SerializedName;

public class Metadata {
    @SerializedName("last_update")
    private Object lastUpdate;

    public Object getLastUpdate(){
        return lastUpdate;
    }
}
