package com.gzu.zcl.myapplication.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.gzu.zcl.myapplication.R;
import com.gzu.zcl.myapplication.adapter.ListDemoAdapter;
import com.gzu.zcl.myapplication.entity.Eneity;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewActivity extends AppCompatActivity {
    private Button button;
    private RecyclerView recyclerView;
    private ListDemoAdapter adapter;
    private List<Eneity> data;
    private boolean qh = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.recycler_view);
        button = findViewById(R.id.bt_qh);
        init();
        layoutManagerChange();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qh = !qh;
                layoutManagerChange();
            }
        });
        adapter = new ListDemoAdapter(data);
        recyclerView.setAdapter(adapter);
    }

    public void layoutManagerChange(){
        if (qh){
            recyclerView.setLayoutManager(new GridLayoutManager(this,2));
            button.setText("网格");
        }else {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            button.setText("列表");
        }
    }

    /**
     * 初始化数据，模拟网络请求获取到数据
     */
    public void init(){
        data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Eneity eneity = new Eneity();
            eneity.setName("index");
            eneity.setId(i);
            data.add(eneity);
        }
    }
}
