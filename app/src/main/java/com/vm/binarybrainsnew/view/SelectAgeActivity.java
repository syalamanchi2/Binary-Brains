package com.vm.binarybrainsnew.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import com.vm.binarybrainsnew.databinding.SelectAgeActivityBinding;

public class SelectAgeActivity extends AppCompatActivity {

    private SelectAgeActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = SelectAgeActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.continueTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectAgeActivity.this,SelectCityActivity.class);
                startActivity(intent);
            }
        });
    }

}