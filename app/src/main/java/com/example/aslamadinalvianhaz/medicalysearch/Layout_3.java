package com.example.aslamadinalvianhaz.medicalysearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Layout_3 extends AppCompatActivity {
    Button tombol;
    Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsj);
        tombol = (Button)findViewById(R.id.ke_layout_utama);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(Layout_3.this, MainActivity.class);
                startActivity(pindah);
                finish();
            }
        });
    }
}
