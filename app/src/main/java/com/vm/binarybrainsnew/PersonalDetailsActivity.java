package com.vm.binarybrainsnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.vm.binarybrainsnew.databinding.PersonalDetailsBinding;
import com.vm.binarybrainsnew.databinding.SelectCityBinding;

public class PersonalDetailsActivity extends AppCompatActivity {

    private PersonalDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = PersonalDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.continueTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(PersonalDetailsActivity.this,InsurersListActivity.class);
//                startActivity(intent);
            }
        });
    }

}
