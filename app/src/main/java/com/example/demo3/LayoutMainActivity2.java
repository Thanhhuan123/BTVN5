package com.example.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class LayoutMainActivity2 extends AppCompatActivity {

    ListView listView;

    Bai1 bai1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_main2);

        listView = findViewById(R.id.listView);


        bai1 = new Bai1(this,listView);
        bai1.execute();
    }
}