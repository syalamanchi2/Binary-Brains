package com.vm.binarybrainsnew.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.vm.binarybrainsnew.controller.MainListAdapter;
import com.vm.binarybrainsnew.model.Root;

import java.util.ArrayList;

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
                rootList = new ArrayList<>();
                for (DataSnapshot positionSnapShot : snapshot.getChildren()) {
                    for(DataSnapshot insurerSnapShot:positionSnapShot.getChildren()){
                        Root root = new Root();
                        for(DataSnapshot dataSnapshot:insurerSnapShot.getChildren()){
                            if(dataSnapshot.getKey().equals("AllowedIllnessLimits")){

                            }else if(dataSnapshot.getKey().equals("InsurerName")){
                                root.setInsurerName(""+dataSnapshot.getValue());
                            }else if(dataSnapshot.getKey().equals("PremiumPerMonth")){
                                root.setPremiumPerMonth(""+dataSnapshot.getValue() + "/Month");
                            }else if(dataSnapshot.getKey().equals("Rating")){
                                root.setRating(""+dataSnapshot.getValue().toString());
                            }else if(dataSnapshot.getKey().equals("YearlyCoverageInLakhs")) {
                                root.setYearlyCoverageInLakhs("" + dataSnapshot.getValue().toString());
                                rootList.add(root);
                            }
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
