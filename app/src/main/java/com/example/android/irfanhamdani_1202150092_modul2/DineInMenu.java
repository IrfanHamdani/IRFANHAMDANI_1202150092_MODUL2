package com.example.android.irfanhamdani_1202150092_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineInMenu extends AppCompatActivity {

    Spinner SP;
    Button btnPesan;
    EditText nmcostumer;

    String[] items = {"Meja 1", "Meja 2", "Meja 3", "Meja 4", "Other"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menudinein);


        nmcostumer = (EditText)findViewById(R.id.namecust);
        SP = (Spinner) findViewById(R.id.spinner);
        btnPesan = (Button)findViewById(R.id.pesan);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        SP.setAdapter(adapter);

        SP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                int index = SP.getSelectedItemPosition();
                Toast.makeText(getBaseContext(), items[index] + " Telah terpilih" ,Toast.LENGTH_SHORT).show();

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}

            public  void onNothingSeleted(AdapterView<?>View){}
        });

        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nmcostumer.getText().toString().length() == 0) {
                    nmcostumer.setError(" Harap mengisi nama anda");
                    Toast.makeText(DineInMenu.this, "Isi terlebih dulu nama anda", Toast.LENGTH_SHORT).show();
                } else {
                    Intent a = new Intent(DineInMenu.this, MenuList.class);
                    startActivity(a);
            }}});
    }
}