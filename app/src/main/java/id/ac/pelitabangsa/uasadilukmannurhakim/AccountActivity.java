package com.example.uasadilukmannurhakim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.pelitabangsa.uasadilukmannurhakim.R;

public class AccountActivity extends AppCompatActivity {
private Button btnmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        btnmenu = findViewById(R.id.btn_home);
        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginMain();
            }
        });
    }
    public void openLoginMain(){
        Intent intent = new Intent(this, com.example.uasadilukmannurhakim.MainActivity2.class);
        startActivity(intent);
    }
}


