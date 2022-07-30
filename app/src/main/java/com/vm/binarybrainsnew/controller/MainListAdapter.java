package com.vm.binarybrainsnew.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vm.binarybrainsnew.R;
import com.vm.binarybrainsnew.model.Root;

import java.util.ArrayList;

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.Viewholder> {

    private Context context;
    private ArrayList<Root> courseModelArrayList;

    // Constructor
    public MainListAdapter(Context context, ArrayList<Root> courseModelArrayList) {
        this.context = context;
        this.courseModelArrayList = courseModelArrayList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        Root model = courseModelArrayList.get(position);
        holder.insurer_name_tv.setText(model.getInsurerName());
        holder.cost_tv.setText(model.getPremiumPerMonth());
        holder.coverage_amount_name.setText(model.getYearlyCoverageInLakhs());
        holder.rating_tv.setText(model.getRating());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return courseModelArrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private TextView coverage_amount_name, policy_period_tv, insurer_name_tv,cost_tv,rating_tv;
        private Button view_button;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            insurer_name_tv = itemView.findViewById(R.id.insurer_name_tv);
            rating_tv = itemView.findViewById(R.id.rating_tv);
            cost_tv = itemView.findViewById(R.id.cost_tv);
            coverage_amount_name = itemView.findViewById(R.id.coverage_amount_name);
            policy_period_tv = itemView.findViewById(R.id.policy_period_tv);
            view_button = itemView.findViewById(R.id.view_button);

        }
    }
}
