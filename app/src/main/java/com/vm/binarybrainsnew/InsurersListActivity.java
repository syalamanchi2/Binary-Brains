package com.vm.binarybrainsnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.vm.binarybrainsnew.databinding.ActivityInsurersListBinding;
import com.vm.binarybrainsnew.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class InsurersListActivity extends AppCompatActivity {
    ActivityInsurersListBinding binding;
    private MainListAdapter adapter;
    private ArrayList<Root> rootList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInsurersListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FirebaseDatabase firebaseDatabaseInstance = null;
        firebaseDatabaseInstance = FirebaseDatabase.getInstance();
        firebaseDatabaseInstance.setPersistenceEnabled(true);
        DatabaseReference ref = firebaseDatabaseInstance.getReference();
        Query query = ref.child("Insurers");
        query.keepSynced(true);
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                for (DataSnapshot positionSnapShot : snapshot.getChildren()) {
                    for(DataSnapshot insurerSnapShot:positionSnapShot.getChildren()){
                         rootList = new ArrayList<>();
                        for(DataSnapshot dataSnapshot:insurerSnapShot.getChildren()){
                            Root root = new Root();
                            if(dataSnapshot.getKey().equals("AllowedIllnessLimits")){

                            }else if(dataSnapshot.getKey().equals("Benifts")){

                            }else if(dataSnapshot.getKey().equals("InsurerName")){
                                root.setInsurerName(""+dataSnapshot.getValue());
                            }
                            rootList.add(root);
                        }
                    }
                }
                adapter = new MainListAdapter(InsurersListActivity.this, rootList);
                binding.recylerview.setLayoutManager(new LinearLayoutManager(InsurersListActivity.this));
                binding.recylerview.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

    }


}
