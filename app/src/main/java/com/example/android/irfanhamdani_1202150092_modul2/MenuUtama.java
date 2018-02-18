package com.example.android.irfanhamdani_1202150092_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {

    Button Pesan;
    RadioButton DineIn, TakeAway;
    RadioGroup RadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuutama);

        Toast.makeText(MenuUtama.this, "IRFAN HAMDANI_1202150092", Toast.LENGTH_LONG).show();

        Pesan = (Button) findViewById(R.id.pesan);
        DineIn = (RadioButton) findViewById(R.id.dinein);
        TakeAway = (RadioButton) findViewById(R.id.takeaway);
        RadioGroup = (RadioGroup) findViewById(R.id.radio);

        Pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selecteId = RadioGroup.getCheckedRadioButtonId();
                if (selecteId == DineIn.getId()) {
                    Intent menu1 = new Intent(MenuUtama.this, DineInMenu.class);
                    startActivity(menu1);
                    Toast.makeText(getApplicationContext(), "Dine In", Toast.LENGTH_SHORT).show();
                    finish();
                }
                if (selecteId == TakeAway.getId()) {
                    Intent menu2 = new Intent(MenuUtama.this, TakeAwayMenu.class);
                    startActivity(menu2);
                    Toast.makeText(getApplicationContext(), "Take Away", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    };
}
