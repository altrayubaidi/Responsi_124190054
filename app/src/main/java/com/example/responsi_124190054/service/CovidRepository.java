package com.example.responsi_124190054.service;

import com.example.responsi_124190054.service.cases.Case;
import com.example.responsi_124190054.service.hospital.Hospital;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CovidRepository {
    @GET("rekapitulasi_v2/jabar/harian")
    Call<Case> getCases();

    @GET("sebaran_v2/jabar/faskes")
    Call<Hospital> getHospital();
}
