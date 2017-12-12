package com.example.evelyn.mylibrary;

/**
 * Created by Lenovo on 12/12/2017.
 */

public class Buku {
    private String idbuku;
    private String judulbuku;
    private String author;
    private String publisher;

    private String[][] data = new String[][]{
            {"01","Buku A","aaa","kharisma a"},
            {"02","Buku B","bbb","kharisma b"},
            {"03","Buku C","ccc","kharisma c"},
            {"04","Buku D","ddd","kharisma d"},
    };

    public Buku (String idbuku){
        this.idbuku = idbuku;
        this.cariIdbuku();
    }

    private void cariIdbuku() {
        for (int i = 0; i<this.data.length;i++){
            if (this.idbuku.equals(data[i][0])){
                this.judulbuku = data[i][1];
                this.author = data[i][2];
                this.publisher = data[i][3];
            }
        }
    }

    public String getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(String idbuku) {
        this.idbuku = idbuku;
    }

    public String getJudulbuku() {
        return judulbuku;
    }

    public void setJudulbuku(String judulbuku) {
        this.judulbuku = judulbuku;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
