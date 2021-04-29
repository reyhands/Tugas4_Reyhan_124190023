package com.example.homework;

import java.util.ArrayList;

public class GameData {
    private static String[] title = new String[]{"GTA V","GTA 4","GTA SA","Battlefield 4","COD"};
    private static int[] thumbnail = new int[]{R.drawable.gtav,R.drawable.gtaiv,R.drawable.gtasa,R.drawable.bf4,R.drawable.cod};
    private static String[] link = new String[]{"https://www.rockstargames.com/games/V","https://www.rockstargames.com/games/IV","https://www.rockstargames.com/games/sanandreas","https://www.ea.com/games/battlefield/battlefield-4","https://www.callofduty.com/home"};
    private static String[] harga = new String[]{"100000","200000","300000","400000","500000"};


    public static ArrayList<GameModel> getGameList()
    { GameModel gamemodel = null; ArrayList<GameModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++)
        { gamemodel = new GameModel();
        gamemodel.setCoverGame(thumbnail[i]);
        gamemodel.setNamaGame(title[i]);
        gamemodel.setLink(link[i]);
        gamemodel.setHarga(harga[i]);

        list.add(gamemodel);
        }
        return list; }
}

