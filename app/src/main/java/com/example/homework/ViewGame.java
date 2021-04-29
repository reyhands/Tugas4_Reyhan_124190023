package com.example.homework;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ViewGame extends AppCompatActivity {

    private TextView tvNamaGame;
    private TextView tvHarga;
    private ImageView gambar;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_game);
        tvNamaGame = findViewById(R.id.NamaGame);
        tvHarga = findViewById(R.id.HargaGame);
        gambar = findViewById(R.id.imageView);

        String nama = getIntent().getStringExtra("nama");
        String harga = getIntent().getStringExtra("harga");
        int image = getIntent().getIntExtra("gambar",0);

        tvNamaGame.setText(nama);
        tvHarga.setText(harga);
        gambar.setImageResource(image);

    }
}
