package com.example.responsi_124190054.service.cases;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("metadata")
    private Metadata metadata;

    @SerializedName("content")
    private List<Content> content;

    public Metadata getMetadata(){
        return metadata;
    }

    public List<Content> getContent(){
        return content;
    }
}
