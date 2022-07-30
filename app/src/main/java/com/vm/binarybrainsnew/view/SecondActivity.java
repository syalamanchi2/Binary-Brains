package com.vm.binarybrainsnew.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.CompoundButton;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;
    private boolean selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = new Intent(SecondActivity.this,SelectAgeActivity.class);
        binding.selfCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CompoundButton) view).isChecked()){
                    System.out.println("Checked");
                    intent.putExtra("Self","Self");
                } else {
                    System.out.println("Un-Checked");
                }
            }
        });
        binding.spouseCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CompoundButton) view).isChecked()){
                    System.out.println("Checked");
                    intent.putExtra("Spouse","Spouse");
                } else {
                    System.out.println("Un-Checked");
                }
            }
        });
        binding.sonCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CompoundButton) view).isChecked()){
                    System.out.println("Checked");
                    intent.putExtra("Son","Son");
                } else {
                    System.out.println("Un-Checked");
                }
            }
        });
        binding.daughterCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CompoundButton) view).isChecked()){
                    System.out.println("Checked");
                    intent.putExtra("Daughter","Daughter");
                } else {
                    System.out.println("Un-Checked");
                }
            }
        });
        binding.continueTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}