package com.example.android.irfanhamdani_1202150092_modul2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by irfan on 18/02/2018.
 */

public class MenuDetail extends AppCompatActivity {

    private TextView Nmenu,harga,komposisimenu;
    private ImageView imgmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menudetail);

        //inisiasi id yang sesuai
        Nmenu = (TextView) findViewById(R.id.namamenu);
        harga= (TextView) findViewById(R.id.textView_harga);
        komposisimenu = (TextView) findViewById(R.id.textView_komposisi);
        imgmenu = (ImageView) findViewById(R.id.image_img);

        //melalukan get data dari menu
        Intent data = getIntent();
        String menu = data.getStringExtra("Menu");
        String hrga = data.getStringExtra("Harga");
        String deskripsi = data.getStringExtra("Deskripsi");
        Integer gmbr = data.getIntExtra("Gambar",0);

        //melakukan setText untukk data dari activity sebelumnya
        Nmenu.setText(menu);
        harga.setText(hrga);
        komposisimenu.setText(deskripsi);
        imgmenu.setImageResource(gmbr);
    }
}