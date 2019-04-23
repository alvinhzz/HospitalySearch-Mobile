package com.example.aslamadinalvianhaz.medicalysearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Pku extends AppCompatActivity {
    Button tombol, telpon, sms, maps, mendaftar, daftar;
    Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pku);

        tombol = (Button)findViewById(R.id.pku_ke_rsud);
        telpon = (Button)findViewById(R.id.telepon);
        sms    = (Button)findViewById(R.id.pesan);
        maps   = (Button)findViewById(R.id.maps);
        mendaftar = (Button)findViewById(R.id.daftarpasien);
        daftar = (Button)findViewById(R.id.lihatdaftar);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah = new Intent(Pku.this, Layout_4.class);
                startActivity(pindah);
                finish();
            }
        });

        telpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 0274512653"));
                startActivity(x);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto: 0274512653"));
                startActivity(x);
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-7.8018981,110.3637598?q=PKU Muhammadiyah Hospital Of Yogyakarta"));
                x.setPackage("com.google.android.apps.maps");

                if (x.resolveActivity(getPackageManager()) != null){
                    startActivity(x);
                }
            }
        });

        mendaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(Pku.this, InsertData.class);
                startActivity(x);
            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(Pku.this, TampilData.class);
                startActivity(x);
            }
        });

    }
}
