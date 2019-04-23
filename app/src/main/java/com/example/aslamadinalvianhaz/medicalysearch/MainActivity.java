package com.example.aslamadinalvianhaz.medicalysearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button tombol1, tombol2, tombol3;
    Intent pindah1, pindah2, pindah3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombol1 = (Button)findViewById(R.id.ke_layout_rskia);
        tombol2 = (Button)findViewById(R.id.ke_layout_rsj);
        tombol3 = (Button)findViewById(R.id.ke_layout_rsud);

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah1 = new Intent(MainActivity.this, Layout_2.class);
                startActivity(pindah1);
                finish();
            }
        });

        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah2 = new Intent(MainActivity.this, Layout_3.class);
                startActivity(pindah2);
                finish();
            }
        });

        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah3 = new Intent(MainActivity.this, Layout_4.class);
                startActivity(pindah3);
                finish();
            }
        });
    }
}
