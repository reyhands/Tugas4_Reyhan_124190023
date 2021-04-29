package com.example.homework;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Fragment_game extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<GameModel> list=new ArrayList<>();
    public Fragment_game() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.gamelist);
        recyclerView.setHasFixedSize(true);
        list.addAll(GameData.getGameList());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GameAdapter gameAdapter=new GameAdapter(getActivity());
        gameAdapter.setGameModels(list);
        recyclerView.setAdapter(gameAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false);
    }
}