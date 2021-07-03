package com.example.responsi_124190054.service.hospital;

import com.google.gson.annotations.SerializedName;

public class HospitalData {
    @SerializedName("kode_kemkes")
    private Object kodeKemkes;

    @SerializedName("nama")
    private String nama;

    @SerializedName("tipe_faskes")
    private int tipeFaskes;

    @SerializedName("rujukan")
    private Object rujukan;

    @SerializedName("alamat")
    private String alamat;

    @SerializedName("telepon")
    private String telepon;

    @SerializedName("url")
    private Object url;

    @SerializedName("longitude")
    private double longitude;

    @SerializedName("latitude")
    private double latitude;

    @SerializedName("nomor_rujukan")
    private int nomorRujukan;

    public Object getKodeKemkes(){
        return kodeKemkes;
    }

    public String getNama(){
        return nama;
    }

    public int getTipeFaskes(){
        return tipeFaskes;
    }

    public Object getRujukan(){
        return rujukan;
    }

    public String getAlamat(){
        return alamat;
    }

    public String getTelepon(){
        return telepon;
    }

    public Object getUrl(){
        return url;
    }

    public double getLongitude(){
        return longitude;
    }

    public double getLatitude(){
        return latitude;
    }

    public int getNomorRujukan(){
        return nomorRujukan;
    }
}
