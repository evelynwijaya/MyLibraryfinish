package com.example.evelyn.mylibrary;

import java.util.SimpleTimeZone;

/**
 * Created by Lenovo on 11/12/2017.
 */

class Pinjaman {
    private String tglpinjam;
    private String tglkembali;
    private String cek;
    private String idmember;
    private Buku buku;

    private String[][] data = new String[][] {
            {"0001","1 Des 2017","5 Des 2017","01"},
            {"0002","1 Des 2017","6 Des 2017","02"},
            {"0003","1 Des 2017","7 Des 2017","03"},
            {"0004","1 Des 2017","8 Des 2017","04"}
    };

    public Pinjaman (String idmember){
        this.idmember = idmember;
        this.caripinjaman();
    }

    private void caripinjaman() {
        for (int i = 0;i<this.data.length;i++){
            if (this.idmember.equals(this.data[i][0])){
                this.tglpinjam = this.data[i][1];
                this.tglkembali = this.data[i][2];
                this.buku = new Buku(data[i][3]);
                this.cek = "1";
                break;
            }
            else {this.cek = "0";}
        }
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Buku getBuku() {
        return buku;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }

    public String getCek() {
        return cek;
    }

    public void setCek(String cek) {
        this.cek = cek;
    }

    public String getIdmember() {
        return idmember;
    }

    public void setIdmember(String idmember) {
        this.idmember = idmember;
    }
}
