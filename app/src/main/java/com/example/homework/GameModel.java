package com.example.homework;

public class GameModel {
    private String NamaGame;
    private String link;
    private String harga;
    private String gambar;

    public String getNamaGame() {
        return NamaGame;
    }

    public void setNamaGame(String namaGame) {
        NamaGame = namaGame;
    }

    public int getCoverGame() {
        return CoverGame;
    }

    public void setCoverGame(int coverGame) {
        CoverGame = coverGame;
    }

    private int CoverGame;


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
