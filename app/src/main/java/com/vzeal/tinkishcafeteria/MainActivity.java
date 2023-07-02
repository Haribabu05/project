package com.vzeal.tinkishcafeteria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemsAdapter itemsAdapter;
    List<ItemsModel> itemsModelList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rec);

        itemsModelList.add(new ItemsModel("Samosa", "/res/drawable/aaharamlogo", "10.00"));
        itemsModelList.add(new ItemsModel("Frankie", "", "20.00"));
        itemsModelList.add(new ItemsModel("Masala Vadai", "", "15.00"));
        itemsModelList.add(new ItemsModel("Ulundha Vadai", "", "10.00"));
        itemsModelList.add(new ItemsModel("Bonda", "", "10.00"));
        itemsModelList.add(new ItemsModel("ASWIN", "", "15"));
        itemsModelList.add(new ItemsModel("ASWATH", "", "10"));
        itemsModelList.add(new ItemsModel("ASWIN", "", "15"));
        itemsModelList.add(new ItemsModel("ASWATH", "", "10"));
        itemsModelList.add(new ItemsModel("ASWIN", "", "15"));
        itemsAdapter = new ItemsAdapter(itemsModelList);
        itemsAdapter.notifyDataSetChanged();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(itemsAdapter);

    }
}
