package com.vm.binarybrainsnew.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.vm.binarybrainsnew.R;
import com.vm.binarybrainsnew.controller.RecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Integer[] imgs = { R.drawable.life_insurance, R.drawable.life_insurance,R.drawable.life_insurance,R.drawable.life_insurance,R.drawable.life_insurance,R.drawable.life_insurance,R.drawable.life_insurance,R.drawable.life_insurance };
        String[] names = getResources().getStringArray(R.array.insurance_types);
        binding.insurancesGrid.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new RecyclerViewAdapter(this, names, imgs, new RecyclerViewAdapter.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        binding.insurancesGrid.setAdapter(adapter);
    }
}