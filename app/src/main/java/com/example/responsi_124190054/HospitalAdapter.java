package com.example.responsi_124190054;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.responsi_124190054.service.hospital.HospitalData;

import java.util.ArrayList;
import java.util.List;

public class HospitalAdapter extends RecyclerView.Adapter<HospitalAdapter.ViewHolder> {
    private Context context;
    private List<HospitalData> hospitalData;

    public HospitalAdapter(Context context, List<HospitalData> hospitalData) {
        this.context = context;
        this.hospitalData = hospitalData;
    }

    public void setHospitalData(List<HospitalData> hospitalData){
        this.hospitalData = hospitalData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_hospital, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HospitalAdapter.ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return hospitalData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvName, tvAddress;
        private Button btnMaps;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tv_hospital_name);
            tvAddress = itemView.findViewById(R.id.tv_hospital_address);
            btnMaps = itemView.findViewById(R.id.btn_maps);
        }

        public void bind(int position){
            tvName.setText(hospitalData.get(position).getNama());
            tvAddress.setText(hospitalData.get(position).getAlamat());
            btnMaps.setOnClickListener(v ->{
                String address = String.format("geo: 0, 0?q= %s",
                        hospitalData.get(position).getNama());
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(address));
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            });
        }
    }
}
