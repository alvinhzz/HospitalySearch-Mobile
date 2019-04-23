package com.example.aslamadinalvianhaz.medicalysearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Layout_2 extends AppCompatActivity {
    Button back, permatabunda, bhaktiibu, rachmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rskia);
        back = (Button)findViewById(R.id.ke_layout_utama);
        permatabunda = (Button)findViewById(R.id.permatabunda);
        bhaktiibu = (Button)findViewById(R.id.bhaktiibu);
        rachmi = (Button)findViewById(R.id.rachmi);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(Layout_2.this, MainActivity.class);
                startActivity(pindah);
                finish();
            }
        });
    }
}
