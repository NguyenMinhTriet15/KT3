package com.example.kt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class httd extends AppCompatActivity {
    ListView lvhttd;
    ArrayList<String> arrayList;
    Button back;
    Button add;
    EditText edthttd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_httd);
        lvhttd = (ListView) findViewById(R.id.lvhttd);
        arrayList = new ArrayList<>();
        back = (Button) findViewById(R.id.backhttd);
        add = (Button) findViewById(R.id.addhttd);
        edthttd = (EditText) findViewById(R.id.addtext);
        arrayList.add("She is walking to school.");
        ArrayAdapter adapter = new ArrayAdapter(httd.this, android.R.layout.simple_list_item_1, arrayList);
        lvhttd.setAdapter(adapter);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String vidu =edthttd.getText().toString();
                arrayList.add(vidu);
                adapter.notifyDataSetChanged();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(httd.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}