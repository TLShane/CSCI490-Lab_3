package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    StudentAdapter adapter;
    ArrayList<Student> studentlist = new ArrayList<Student>();
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    Student student5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.class_schedule);
        //String[] classes = {"CSCi-490-Mobile_application", "CSCi-230-Data_Structures", "CSCi-362-SoftwareEngineering", "CSCi-320-Programming_language_concepts", "CSCi-345-NetworkSecurity"};
        student1 = new Student ("jessica","Smith","CS");
        student2 = new Student ("bob","dewmire","Art");
        student3 = new Student ("Mark","newnet","DataAnalysis");
        student4 = new Student ("dude","man","Engineer");
        student5 = new Student ("guy","guy","Physics");
        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);
        studentlist.add(student4);
        studentlist.add(student5);
        adapter = new StudentAdapter(this, studentlist);
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

