package com.example.android.irfanhamdani_1202150092_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.LinkedList;

public class MenuList extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;

    private String[] Judulmenu = {"Breakfast Wraft", "Chesseburger", "French Fries", "Happy Meal Cheeseburger", "Happy Meal Chicken", "Hot Cakes", "Iced Coffe", "Mc Float", "PaMer", "Panas Satu"};
    private String[] HargaM = {"Rp.15000", "Rp.20000", "Rp.13000", "Rp.40000", "Rp.35000", "Rp.25000", "Rp.15000", "9000", "33000", "34000"};
    private int[] Gambar = {R.drawable.breakfastwraft, R.drawable.chesseburger, R.drawable.frenchfries, R.drawable.happymealcheeseburger, R.drawable.happymealchicken, R.drawable.hotcakes, R.drawable.icedcoffe, R.drawable.mcfloat, R.drawable.pamer, R.drawable.panassatu};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menulist);

        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.Rview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu, dataHarga, gambar);
        rvView.setAdapter(adapter);
    }

    private void DaftarItem() {
        for (int w = 0; w < Judulmenu.length; w++) {
            dataMenu.add(Judulmenu[w]);
            dataHarga.add(HargaM[w]);
            gambar.add(Gambar[w]);
        }
    }
}