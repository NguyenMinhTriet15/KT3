package com.example.kt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvtenses;
    ArrayList<String> arrayCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvtenses = (ListView) findViewById(R.id.lvtenses);
        arrayCourse = new ArrayList<>();
        arrayCourse.add("Thì hiện tại đơn");
        arrayCourse.add("Thì hiện tại tiếp diễn");
        arrayCourse.add("Thì hiện tại hoàn thành");
        arrayCourse.add("Thì quá khứ đơn");
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayCourse);
        lvtenses.setAdapter(adapter);
        lvtenses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0)
                {
                    Intent it =new Intent(MainActivity.this, htd.class);
                    startActivity(it);
                }
                if (i==1)
                {
                    Intent it1 = new Intent(MainActivity.this, httd.class);
                    startActivity(it1);
                }
                if (i==2)
                {
                    Intent it2 = new Intent(MainActivity.this, htht.class);
                    startActivity(it2);
                }
                if (i==3)
                {
                    Intent it3 = new Intent(MainActivity.this, qkd.class);
                    startActivity(it3);
                }
            }
        });
    }
}