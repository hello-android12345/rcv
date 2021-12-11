package com.android.rcv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    List<data>data1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rcv);
        data1=new ArrayList<>();
       for(int i=1;i<15;i++) {
           data d1 = new data();
           d1.setTitle("Bharat");
           d1.setDes("Bhushan");
           d1.setImg_url("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Gyan_Vihar_Logo.jpg/220px-Gyan_Vihar_Logo.jpg");
           data1.add(d1);
       }
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new myadapter(this,data1));
    }
}