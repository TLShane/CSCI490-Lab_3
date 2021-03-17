package com.example.lab3_tl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.class_schedule);
        String[] classes = {"CSCi-490-Mobile_application", "CSCi-230-Data_Structures", "CSCi-362-SoftwareEngineering", "CSCi-320-Programming_language_concepts", "CSCi-345-NetworkSecurity"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, classes);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "short", Toast.LENGTH_SHORT).show();
            }
        });
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "long", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}