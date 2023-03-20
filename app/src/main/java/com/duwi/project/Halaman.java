package com.duwi.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.duwi.project.R;

public class Halaman extends AppCompatActivity {
    Button btnPertama, btnKedua;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman);
        btnPertama = (Button) findViewById(R.id.fragment1);
        btnKedua = (Button) findViewById(R.id.fragment2);
        btnPertama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new Fragment1());
            }
        });
        btnKedua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new Fragment2());
            }
        });
    }
private void loadFragment(androidx.fragment.app.Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
    //membuat fragmentTransaction untuk memulai dan menggantikan halaman yg sebelumnya
    FragmentTransaction ft = fm.beginTransaction();
    //menggantikan frameLayout dengan halaman yg baru
    ft.replace(R.id.frameLayout, fragment);
    //untuk menyimpan perubahan
    ft.commit();
    }
    }
