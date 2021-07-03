package com.example.responsi_124190054;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.responsi_124190054.service.ApiMain;
import com.example.responsi_124190054.service.cases.Case;
import com.example.responsi_124190054.service.cases.Content;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CaseModel extends ViewModel {
    private static final String TAG = "CaseModel";
    private MutableLiveData<List<Content>> contentLists;

    public CaseModel(){
        contentLists = new MutableLiveData<>();
    }

    public MutableLiveData<List<Content>> getContentLists() {
        return contentLists;
    }

    public void loadCases(){
        ApiMain apiMain = new ApiMain();
        apiMain.getAPI().getCases().enqueue(new Callback<Case>() {
            @Override
            public void onResponse(Call<Case> call, Response<Case> response) {
                contentLists.setValue(response.body().getData().getContent());
            }

            @Override
            public void onFailure(Call<Case> call, Throwable t) {
                Log.d(TAG, "onFailure: Kesalahan pengambilan data kasus COVID-19");
            }
        });
    }
}
