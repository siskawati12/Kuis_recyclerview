package com.example.reclyclerview;

public class keluarga {
    private String  nama, status;
    private Integer gambar;

    public Integer getGambar(){
        return gambar;
    }

    public void setGambar(Integer gambar){
        this.gambar = gambar;
    }

    public keluarga(String nama, String status, Integer gambar){
        this.nama = nama;
        this.status = status;
        this.gambar = gambar;
    }

    public String getNama() {return nama;}

    public void setNama (String nama) { this.nama = nama;}

    public String getStatus() { return status;}

    public void setStatus (String status) {this.status = status;}


}
