package com.example.aslamadinalvianhaz.medicalysearch;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TampilData extends AppCompatActivity {
    String[] daftar;
    ListView listView;
    protected Cursor kursor;
    DataHelper dbCenter;
    public static TampilData td;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_data);
        
        td = this;
        dbCenter = new DataHelper(this);
        RfreshList();
    }

    void RfreshList() {
        SQLiteDatabase db = dbCenter.getReadableDatabase();
        kursor = db.rawQuery("SELECT*FROM pasien", null);
        daftar = new String[kursor.getCount()];
        kursor.moveToFirst();

        for (int i = 1; i < kursor.getCount(); i++){
            kursor.moveToPosition(i);
            daftar[i] = kursor.getString(1).toString();
        }

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));
        listView.setSelected(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                final String selection = daftar[i];
                final CharSequence[] dialog = {
                        "Lihat Detail"
                };

                AlertDialog.Builder buat = new AlertDialog.Builder(TampilData.this);
                buat.setTitle("Pilihan");
                buat.setItems(dialog, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        switch (i){
                            case 0 :
                                Intent x = new Intent(getApplicationContext(), Tampil2Data.class);
                                x.putExtra("nama", selection);
                                startActivity(x);
                                break;
                        }
                    }
                });
                buat.create().show();
            }
        });
        ((ArrayAdapter)listView.getAdapter()).notifyDataSetInvalidated();
    }
}
