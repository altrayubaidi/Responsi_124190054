package com.example.responsi_124190054;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.responsi_124190054.service.ApiMain;
import com.example.responsi_124190054.service.hospital.Hospital;
import com.example.responsi_124190054.service.hospital.HospitalData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HospitalModel extends ViewModel {

    private static final String TAG = "HospitalModel";
    private MutableLiveData<List<HospitalData>> hospitalData;

    public HospitalModel(){
        hospitalData = new MutableLiveData<>();
    }

    public MutableLiveData<List<HospitalData>> getHospitalData() {
        return hospitalData;
    }

    public void loadHospital() {
        ApiMain apiMain = new ApiMain();
        apiMain.getAPI().getHospital().enqueue(new Callback<Hospital>() {
            @Override
            public void onResponse(Call<Hospital> call, Response<Hospital> response) {
                hospitalData.setValue(response.body().getData());
            }

            @Override
            public void onFailure(Call<Hospital> call, Throwable t) {
                Log.d(TAG, "Kesalahan Pengambilan Data RS Rujukan COVID-19");
            }
        });
    }
}
