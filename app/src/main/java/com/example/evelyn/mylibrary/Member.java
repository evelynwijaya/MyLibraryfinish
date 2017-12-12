package com.example.evelyn.mylibrary;

/**
 * Created by Lenovo on 11/12/2017.
 */

public class Member extends User{

    private String id_member;
    private Pinjaman pinjaman;



    public Member(String email) {
        super(email);
    }

    public String getId_member() {
        return id_member;
    }

    public void setId_member(String id_member) {
        this.id_member = id_member;
    }

    public Pinjaman getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(Pinjaman pinjaman) {
        this.pinjaman = pinjaman;
    }
}
