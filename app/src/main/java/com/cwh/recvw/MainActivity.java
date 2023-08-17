package com.cwh.recvw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();




    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.girl1,"Sandra","10:45 Am","Hello World!"));
        userList.add(new ModelClass(R.drawable.girl2,"Rohini","11:45 Am","How are you!"));
        userList.add(new ModelClass(R.drawable.boy1,"Tom","12:45 Pm","Whatsup?"));
        userList.add(new ModelClass(R.drawable.boy2,"Roy","10:45 Am","Yo!"));
        userList.add(new ModelClass(R.drawable.girl2,"Sandra","10:45 Am","Hello World!"));
        userList.add(new ModelClass(R.drawable.girl1,"Rohini","11:45 Am","How are you!"));
        userList.add(new ModelClass(R.drawable.boy2,"Tom","12:45 Pm","Whatsup?"));
        userList.add(new ModelClass(R.drawable.boy1,"Roy","10:45 Am","Yo!"));
        userList.add(new ModelClass(R.drawable.girl1,"Sandra","10:45 Am","Hello World!"));
        userList.add(new ModelClass(R.drawable.girl2,"Rohini","11:45 Am","How are you!"));
        userList.add(new ModelClass(R.drawable.boy1,"Tom","12:45 Pm","Whatsup?"));
        userList.add(new ModelClass(R.drawable.boy2,"Roy","10:45 Am","Yo!"));
        userList.add(new ModelClass(R.drawable.girl2,"Sandra","10:45 Am","Hello World!"));
        userList.add(new ModelClass(R.drawable.girl1,"Rohini","11:45 Am","How are you!"));
        userList.add(new ModelClass(R.drawable.boy2,"Tom","12:45 Pm","Whatsup?"));
        userList.add(new ModelClass(R.drawable.boy1,"Roy","10:45 Am","Yo!"));



    }

    private void initRecyclerView() {

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}