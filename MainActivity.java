package com.example.frag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button a1, a2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        farg1 f1 = new farg1();
        frag2 f2 = new frag2();
        FragmentManager fn  = getSupportFragmentManager();
        FragmentTransaction ft = fn.beginTransaction();
        ft.add(R.id.frameLayout, f1);
        a1 = findViewById(R.id.button);
        a2= findViewById(R.id.button2);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fn  = getSupportFragmentManager();
                FragmentTransaction ft = fn.beginTransaction();
                ft.replace(R.id.frameLayout, f1);
                Toast.makeText(MainActivity.this, "Fragment 1", Toast.LENGTH_SHORT).show();
                ft.commit();

            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fn  = getSupportFragmentManager();
                FragmentTransaction ft = fn.beginTransaction();
                ft.replace(R.id.frameLayout, f2);
                Toast.makeText(MainActivity.this, "Fragment 2", Toast.LENGTH_SHORT).show();
                ft.commit();
            }
        });
    }
}
