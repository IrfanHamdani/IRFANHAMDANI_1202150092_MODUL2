package com.example.android.irfanhamdani_1202150092_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAwayMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menutakeaway);

        final EditText nama = (EditText) findViewById(R.id.name);
        final EditText phone = (EditText) findViewById(R.id.phone);
        final EditText alamat = (EditText) findViewById(R.id.alamat);
        EditText catatan = (EditText) findViewById(R.id.catatan);
        Button btnPesan = (Button) findViewById(R.id.pesan);

        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(nama.getText().toString().length()==0){
                nama.setError("Harap mengisi nama anda");
                Toast.makeText(TakeAwayMenu.this,"Isi kolom nama terlebih dulu", Toast.LENGTH_SHORT).show();
                }else if (phone.getText().toString().length()==0){
                    phone.setError("Harap mengisi telepon anda");
                    Toast.makeText(TakeAwayMenu.this,"Isi kolom phone terlebih dulu", Toast.LENGTH_SHORT).show();
                }else if(alamat.getText().toString().length()==0){
                    alamat.setError("Harap mengisi alamat anda");
                    Toast.makeText(TakeAwayMenu.this,"Isi kolom alamat terlebih dulu", Toast.LENGTH_SHORT).show();
                }else {
                    Intent take = new Intent(TakeAwayMenu.this, MenuList.class);
                    startActivity(take);
                    Toast.makeText(TakeAwayMenu.this,"Terima Kasih telah menginputkan data", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}