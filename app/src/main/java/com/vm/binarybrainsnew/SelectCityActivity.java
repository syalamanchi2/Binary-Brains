package com.vm.binarybrainsnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.vm.binarybrainsnew.databinding.ActivitySelectAgeBinding;
import com.vm.binarybrainsnew.databinding.SelectCityBinding;

public class SelectCityActivity extends AppCompatActivity {

    private SelectCityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = SelectCityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.continueTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectCityActivity.this,PersonalDetailsActivity.class);
                intent.putExtra("City",binding.userAgeEt.getText().toString());
                startActivity(intent);
            }
        });
    }

}