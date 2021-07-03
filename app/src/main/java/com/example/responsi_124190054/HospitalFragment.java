package com.example.responsi_124190054;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HospitalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HospitalFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    private HospitalModel hospitalModel;
    private RecyclerView revHospital;
    private HospitalAdapter hospitalAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hospital, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        hospitalModel = new ViewModelProvider(this).get(HospitalModel.class);
        revHospital = view.findViewById(R.id.rev_hospital);
        hospitalAdapter = new HospitalAdapter(getActivity(), new ArrayList<>());

        revHospital.setHasFixedSize(true);
        revHospital.setLayoutManager(new LinearLayoutManager(getActivity(),
                RecyclerView.VERTICAL, true));
        revHospital.setAdapter(hospitalAdapter);

        hospitalModel.getHospitalData().observe(requireActivity(), contentItems -> {
            hospitalAdapter.setHospitalData(contentItems);
            hospitalAdapter.notifyDataSetChanged();
        });
        hospitalModel.loadHospital();
    }
}