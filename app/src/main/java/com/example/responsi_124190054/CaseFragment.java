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
 * Use the {@link CaseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CaseFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private CaseModel caseModel;
    private RecyclerView revCases;
    private CaseAdapter caseAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_case, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        caseModel = new ViewModelProvider(this).get(CaseModel.class);
        revCases = view.findViewById(R.id.rev_case);
        caseAdapter = new CaseAdapter(getActivity(), new ArrayList<>());

        revCases.setHasFixedSize(true);
        revCases.setLayoutManager(new LinearLayoutManager(getActivity(),
                RecyclerView.VERTICAL, true));
        revCases.setAdapter(caseAdapter);

        caseModel.getContentLists().observe(requireActivity(), contentItems -> {
        caseAdapter.setContentLists(contentItems);
        caseAdapter.notifyDataSetChanged();
        revCases.scrollToPosition(caseAdapter.getItemCount()-1);
        });
        caseModel.loadCases();
    }
}