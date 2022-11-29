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

public class htd extends AppCompatActivity {
    ListView lvhtd;
    ArrayList<String> arraayCourse;
    Button btnback;
    Button btnadd;
    EditText viduedt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htd);
        lvhtd = (ListView) findViewById(R.id.lvhtd);
        arraayCourse = new ArrayList<>();
        btnadd = (Button) findViewById(R.id.btnadd);
        viduedt = (EditText) findViewById(R.id.edtadd);
        btnback = (Button) findViewById(R.id.back);
        arraayCourse.add("She walks to school everyday.");
        ArrayAdapter adapter = new ArrayAdapter(htd.this, android.R.layout.simple_list_item_1, arraayCourse);
        lvhtd.setAdapter(adapter);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String vidu = viduedt.getText().toString();
                arraayCourse.add(vidu);
                adapter.notifyDataSetChanged();
            }
        });
            btnback.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent it = new Intent(htd.this, MainActivity.class);
                    startActivity(it);
                }
            });

    }
}