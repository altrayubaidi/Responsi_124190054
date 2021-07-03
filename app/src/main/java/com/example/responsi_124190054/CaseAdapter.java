package com.example.responsi_124190054;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.responsi_124190054.service.cases.Content;

import java.util.List;

public class CaseAdapter extends RecyclerView.Adapter<CaseAdapter.ViewHolder> {
    private Context context;
    private List<Content> contentLists;

    public CaseAdapter(Context context, List<Content> contentLists){
        this.context = context;
        this.contentLists = contentLists;
    }

    public void setContentLists(List<Content> contentLists){
        this.contentLists = contentLists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_case, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CaseAdapter.ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return contentLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvDate, tvConfirmed, tvRecovered, tvPassed;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvDate = itemView.findViewById(R.id.tv_item_date);
            tvConfirmed = itemView.findViewById(R.id.tv_item_confirmed);
            tvRecovered = itemView.findViewById(R.id.tv_item_recovered);
            tvPassed = itemView.findViewById(R.id.tv_item_passed);
        }

        public void bind(int position) {
            tvDate.setText(contentLists.get(position).getTanggal());
            tvConfirmed.setText(String.valueOf(contentLists.get(position).getConfirmationDiisolasi()));
            tvRecovered.setText(String.valueOf(contentLists.get(position).getConfirmationSelesai()));
            tvPassed.setText(String.valueOf(contentLists.get(position).getConfirmationMeninggal()));
        }
    }
}
