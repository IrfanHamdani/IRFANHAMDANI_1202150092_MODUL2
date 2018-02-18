package com.example.android.irfanhamdani_1202150092_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by irfan on 18/02/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> rvDatamenu,rvHarga;
    private ArrayList<Integer> rvImg;

    public RecyclerViewAdapter(ArrayList<String> dataMenu, ArrayList<String> dataHarga, ArrayList<Integer> gambar) {
        rvDatamenu = dataMenu;
        rvHarga = dataHarga;
        rvImg = gambar;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;
        public TextView tvSubtitle;
        public ImageView a;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();
            tvTitle = (TextView) itemView.findViewById(R.id.tittle);
            tvSubtitle = (TextView) itemView.findViewById(R.id.sub_tittle);
            a = (ImageView) itemView.findViewById(R.id.image_gambar);
            ItemList = itemView.findViewById(R.id.layout_item);

            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myintent = new Intent(context, MenuDetail.class);
                    String deskripsi = "";
                    switch (getAdapterPosition()) {

                        case 0:
                            myintent.putExtra("Menu", rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("Gambar", rvImg.get(getAdapterPosition()));
                            deskripsi = "Daging ayam asap, scrambled egg, dan keju gurih dalam balutan tortilla yang lembut.";
                            myintent.putExtra("Deskripsi", deskripsi);
                            context.startActivity(myintent);
                            break;
                        case 1:
                            myintent.putExtra("Menu", rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("Gambar", rvImg.get(getAdapterPosition()));
                            deskripsi = "Roti burger, daging sapi, keju, saus tomat, acar, potongan bawang dan mustard.";
                            myintent.putExtra("Deskripsi", deskripsi);
                            context.startActivity(myintent);
                            break;
                        case 2:
                            myintent.putExtra("Menu", rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("Gambar", rvImg.get(getAdapterPosition()));
                            deskripsi = "Kentang goreng renyah.";
                            myintent.putExtra("Deskripsi", deskripsi);
                            context.startActivity(myintent);
                            break;
                        case 3:
                            myintent.putExtra("Menu", rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("Gambar", rvImg.get(getAdapterPosition()));
                            deskripsi = "1 Cheeseburger, 1 reg. Fries + 1 reg. drink dan 1 mainan Happy Meal.";
                            myintent.putExtra("Deskripsi", deskripsi);
                            context.startActivity(myintent);
                            break;
                        case 4:
                            myintent.putExtra("Menu", rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("Gambar", rvImg.get(getAdapterPosition()));
                            deskripsi = "1 Chicken + 1 rice + 1 reg. drink dan 1 mainan Happy Meal.";
                            myintent.putExtra("Deskripsi", deskripsi);
                            context.startActivity(myintent);
                            break;
                        case 5:
                            myintent.putExtra("Menu", rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("Gambar", rvImg.get(getAdapterPosition()));
                            deskripsi = "3 potong pancakes, mentega dan maple syrup.";
                            myintent.putExtra("Deskripsi", deskripsi);
                            context.startActivity(myintent);
                            break;
                        case 6:
                            myintent.putExtra("Menu", rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("Gambar", rvImg.get(getAdapterPosition()));
                            deskripsi = "Alternatif segar untuk menikmati kopi dingin ditambah krim dan bubuk cokelat.";
                            myintent.putExtra("Deskripsi", deskripsi);
                            context.startActivity(myintent);
                            break;
                        case 7:
                            myintent.putExtra("Menu", rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("Gambar", rvImg.get(getAdapterPosition()));
                            deskripsi = "Coca cola/ Fanta, es krim vanilla, dan sirup coklat/strawberry.";
                            myintent.putExtra("Deskripsi", deskripsi);
                            context.startActivity(myintent);
                            break;
                        case 8:
                            myintent.putExtra("Menu", rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("Gambar", rvImg.get(getAdapterPosition()));
                            deskripsi = "Paket murah meriah 3 lemon tea, 3 nasi, 3 ayam paha, 2 ayam dada.";
                            myintent.putExtra("Deskripsi", deskripsi);
                            context.startActivity(myintent);
                            break;
                        case 9:
                            myintent.putExtra("Menu", rvDatamenu.get(getAdapterPosition()));
                            myintent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            myintent.putExtra("Gambar", rvImg.get(getAdapterPosition()));
                            deskripsi = "Paket nasi satu, 1 nasi, 1 ayam, 1 lemon tea.";
                            myintent.putExtra("Deskripsi", deskripsi);
                            context.startActivity(myintent);
                            break;
                    }
                }
            });
        }
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.wordlist_item, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vholder = new ViewHolder(v);
        return vholder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String name = rvDatamenu.get(position);
        final String harga = rvHarga.get(position);
        final Integer test = rvImg.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitle.setText(harga);
        holder.a.setImageResource(test);
    }

    @Override
    public int getItemCount() {
        return rvDatamenu.size();
    }


}
