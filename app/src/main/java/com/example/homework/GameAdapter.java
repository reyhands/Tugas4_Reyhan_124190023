package com.example.homework;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import static androidx.core.content.ContextCompat.startActivity;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder>
{
    private Context context;
    private ArrayList<GameModel> gameModels;

    public GameAdapter(Context context) {
        this.context = context;
           }


    @NonNull
    @Override
    public GameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
        { View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_game,viewGroup,false);
        return new ViewHolder(itemRow);
    }



    @Override
    public int getItemCount() {
        return getGameModels().size();
    }


    public ArrayList<GameModel> getGameModels() {
        return gameModels;
    }

    public void setGameModels(ArrayList<GameModel> gameModels) {
        this.gameModels = gameModels;
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView ivCoverGame;
        private TextView tvNamaGame;
        private Button btnInfo;
        private Button btnBuy;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivCoverGame = itemView.findViewById(R.id.imageView2);
            tvNamaGame = itemView.findViewById(R.id.textView);


            btnInfo = itemView.findViewById(R.id.infogame);
            btnBuy = itemView.findViewById(R.id.buygame);



        }
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getGameModels().get(i).getCoverGame()).into(viewHolder.ivCoverGame);
        viewHolder.tvNamaGame.setText(getGameModels().get(i).getNamaGame());

        viewHolder.btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent moveWithDataIntent = new Intent(v.getContext() , ViewGame.class);
                moveWithDataIntent.putExtra("nama",getGameModels().get(i).getNamaGame());
                moveWithDataIntent.putExtra("harga", getGameModels().get(i).getHarga());
                moveWithDataIntent.putExtra("gambar", getGameModels().get(i).getCoverGame());
                context.startActivity(moveWithDataIntent);
            }
        });

        viewHolder.btnBuy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v ) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(getGameModels().get(i).getLink()));
                context.startActivity(intent);

            }


        });


    }
}

