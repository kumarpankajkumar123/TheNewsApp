package com.example.themeunderstanding.Adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.themeunderstanding.Modals.Latest;
import com.example.themeunderstanding.R;

import java.util.List;

public class RecyclerAdaptor extends RecyclerView.Adapter<RecyclerAdaptor.MyViewHolder> {

    List<Latest> latestList;

    public RecyclerAdaptor(List<Latest> latestList){
        this.latestList = latestList;
    }

    @NonNull
    @Override
    public RecyclerAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_design,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdaptor.MyViewHolder holder, int position) {
         Latest latest = latestList.get(position);
         holder.domain.setText(latest.getDomain());
         holder.tittle.setText(latest.getTitle());
    }

    @Override
    public int getItemCount() {
        return latestList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView domain,tittle,link;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            domain = itemView.findViewById(R.id.domain);
            tittle = itemView.findViewById(R.id.tittle);
            link = itemView.findViewById(R.id.link);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
