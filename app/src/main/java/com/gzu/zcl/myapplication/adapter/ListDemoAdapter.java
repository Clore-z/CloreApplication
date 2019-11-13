package com.gzu.zcl.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gzu.zcl.myapplication.R;
import com.gzu.zcl.myapplication.entity.Eneity;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListDemoAdapter extends RecyclerView.Adapter<ListDemoAdapter.ListViewHolder> {

    private List<Eneity> data;


    static class ListViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_text);
        }
    }

    public ListDemoAdapter(List<Eneity> data){
        this.data = data;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_demo,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Eneity eneity = data.get(position);
        String stringBuilder = eneity.getName();
        String num = String.valueOf(eneity.getId());
        holder.textView.setText(stringBuilder+num);
    }

    @Override
    public int getItemCount() {
        return data==null ? 0 : data.size();
    }

}
