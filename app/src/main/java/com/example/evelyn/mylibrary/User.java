package com.example.evelyn.mylibrary;

import java.util.SimpleTimeZone;

/**
 * Created by Lenovo on 11/12/2017.
 */

public class User {

    private String email;
    private String password;
    private String namalengkap;
    private String telp;
    private String id;

    private String[][] data = new String [][]{
            {"0001","evelynw09522@gmail.com","eve","Evelyn Wijaya","082193149209"},
            {"0002","winnyclaudia_16@gmail.ac.id","win","Winny Claudia","082193149209"},
            {"0003","legionpg@gmail.com","bowo","Prabowo Gosal","082193149209"},
            {"0004","sofyan.thayf@kharisma.ac.id","sofyan","Sofyan Thayf","082193149209"}
    };

    public User (String email){
        this.email = email;
        this.login();

    }

    public void setEmail(String email) {
        this.email = email;
        this.login();
    }

    public void setPassword(String password) {
        this.password = password;
        this.login();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private void login() {
        for (int i=0;i<this.data.length;i++){
            if (this.email.equals(data[i][1])){
                this.id = this.data[i][0];
                this.password = this.data[i][2];
                this.namalengkap =  this.data[i][3];
                this.telp =  this.data[i][4];
            }
        }

    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
}
