package com.example.aslamadinalvianhaz.medicalysearch;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Tampil2Data extends AppCompatActivity {
    protected Cursor kursor;
    DataHelper dbHelper;
    Button back;
    TextView nik, nama, tgl, kelamin, alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil2_data);
        dbHelper = new DataHelper(this);
        nik = (TextView)findViewById(R.id.tampilNik);
        nama = (TextView)findViewById(R.id.tampilNama);
        tgl = (TextView)findViewById(R.id.tampilTgl);
        kelamin = (TextView)findViewById(R.id.tampilKelamin);
        alamat = (TextView)findViewById(R.id.tampilAlamat);

        SQLiteDatabase db = dbHelper.getReadableDatabase();

        kursor = db.rawQuery("SELECT*FROM pasien WHERE nama = '" +
                getIntent().getStringExtra("nama")+"'", null);

        kursor.moveToFirst();
        if (kursor.getCount() > 0){
            kursor.moveToPosition(0);
            nik.setText(kursor.getString(0).toString());
            nama.setText(kursor.getString(1).toString());
            tgl.setText(kursor.getString(2).toString());
            kelamin.setText(kursor.getString(3).toString());
            alamat.setText(kursor.getString(4).toString());
        }
        back = (Button)findViewById(R.id.back1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
