package com.example.android1_hw3recycler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView rec_v;

    String s1[], s2[];
    int images[] = {R.drawable.c_plus_plus,R.drawable.c_sharp,R.drawable.java,R.drawable.js,R.drawable.kotlin,
            R.drawable.python,R.drawable.rub,R.drawable.swift,R.drawable.typescript,R.drawable.vstudio};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec_v = findViewById(R.id.rec_v);

        s1 = getResources().getStringArray(R.array.tech_laguages);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter=new MyAdapter(this, s1, s2, images);
        rec_v.setAdapter(myAdapter);
        rec_v.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.exemple_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Item 3 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem1:
                Toast.makeText(this, "Sub Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this, "Sub Item 2 selected", Toast.LENGTH_SHORT).show();

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}