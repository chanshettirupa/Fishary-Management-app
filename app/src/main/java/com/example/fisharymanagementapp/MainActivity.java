package com.example.fisharymanagementapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

RecyclerView recyclerView ;
RecyclerAdapter adapter;

String dealer_names[] = {"Ajay","Rahul","Raj","Kajal","Priti","magesh" , "Kiran"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seller_page);
        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.recleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new RecyclerAdapter(this,dealer_names);
        recyclerView.setAdapter(adapter);

    }
}
