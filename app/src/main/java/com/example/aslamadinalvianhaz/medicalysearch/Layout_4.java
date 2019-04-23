package com.example.aslamadinalvianhaz.medicalysearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Layout_4 extends AppCompatActivity {
    Button kembali, pku;
    Intent pindah;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rsud);

        kembali = (Button)findViewById(R.id.ke_layout_utama);
        pku = (Button)findViewById(R.id.ke_layout_pku);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(Layout_4.this, MainActivity.class);
                startActivity(pindah);
                finish();
            }
        });

        pku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah =  new Intent(Layout_4.this, Pku.class);
                startActivity(pindah);
                finish();
            }
        });

    }
}
