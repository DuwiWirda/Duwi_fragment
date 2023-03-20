package com.duwi.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button btnBack;
    Button btnLogout;
    Button btnDetail;
    Button btnListView;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pref = getSharedPreferences("Login", MODE_PRIVATE);
        btnBack = findViewById(R.id.btnback);
        btnLogout = findViewById(R.id.btnlogout);
        btnDetail = findViewById(R.id.btndetail);
        btnListView = findViewById(R.id.btnListView);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = pref.edit();
                editor.clear();
                editor.apply();
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Halaman Detail", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity2.this, Halaman.class);
                startActivity(intent);
            }
        });

        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "Halaman List View", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity2.this, ListActivity.class);
                startActivity(intent);
            }
        });
    }
}
