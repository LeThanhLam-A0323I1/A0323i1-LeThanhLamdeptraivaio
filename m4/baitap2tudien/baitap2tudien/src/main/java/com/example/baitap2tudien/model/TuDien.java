package com.example.baitap2tudien.model;

public class TuDien {
    private String tiengAnh;
    private String tiengViet;

    public TuDien() {
    }

    public TuDien(String tiengAnh, String tiengViet) {
        this.tiengAnh = tiengAnh;
        this.tiengViet = tiengViet;
    }

    public String getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(String tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public String getTiengViet() {
        return tiengViet;
    }

    public void setTiengViet(String tiengViet) {
        this.tiengViet = tiengViet;
    }
}
