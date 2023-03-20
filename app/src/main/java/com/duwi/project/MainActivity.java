package com.duwi.project;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.duwi.project.R;

public class MainActivity extends AppCompatActivity {
    EditText edituser, editpass;
    Button btnlogin, btndaftar;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pref = getSharedPreferences("login", MODE_PRIVATE);
        if (pref.contains("username")){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            finish();
        }
        setContentView(R.layout.activity_main);
        edituser = findViewById(R.id.edituser);
        editpass = findViewById(R.id.editpass);
        btnlogin = findViewById(R.id.btnlogin);
        btndaftar = findViewById(R.id.btndaftar);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username  = edituser.getText().toString();
                String password = editpass.getText().toString();
                if(username.equals("duwi") && password.equals("123")){
                SharedPreferences.Editor editor = pref.edit();
                Toast.makeText(MainActivity.this, "Login Berhasil",Toast.LENGTH_LONG).show();
                editor.putString("password",password);
                editor.putString("username",username);
                editor.commit();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
                //agar tidak kembali ke halaman sebelumnya
            }else {
                Toast.makeText(MainActivity.this, "Username atau password salah", Toast.LENGTH_LONG).show();
            }}
        });
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Daftar.class);
                startActivity(intent);
            }
        });
    }
}