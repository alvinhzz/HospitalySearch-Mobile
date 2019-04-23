package com.example.aslamadinalvianhaz.medicalysearch;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertData extends AppCompatActivity {
    protected Cursor kursor;
    DataHelper dataHelper;
    EditText nik, nama, tgl, kelamin, alamat;
    Button insertData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);
        nik = (EditText)findViewById(R.id.nikPasien);
        nama= (EditText)findViewById(R.id.namaPasien);
        tgl = (EditText)findViewById(R.id.birthPasien);
        kelamin = (EditText)findViewById(R.id.kelaminPasien);
        alamat = (EditText)findViewById(R.id.alamatPasien);
        insertData = (Button)findViewById(R.id.insertPasien);

        insertData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = dataHelper.getWritableDatabase();
                db.execSQL("INSERT INTO pasien(nik, nama, tgl_lahir, kelamin, alamat) VALUES ('" +
                        nik.getText().toString()+"','" +
                        nama.getText().toString()+"','" +
                        tgl.getText().toString()+"','" +
                        kelamin.getText().toString()+"','" +
                        alamat.getText().toString()+"')");
                Toast.makeText(getApplicationContext(), "Berhasil Mendaftar", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
