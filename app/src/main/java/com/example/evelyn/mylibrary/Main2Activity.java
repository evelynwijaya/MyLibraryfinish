package com.example.evelyn.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tv_noanggota,tv_namaanggota,tv_emailanggota,tv_buku,tv_author,tv_publisher,tv_tglpinjam,tv_tglkembali;
    private User user;
    private Pinjaman pinjaman;
    private String id = "id";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_noanggota = (TextView) findViewById(R.id.tv_noanggota);
        tv_namaanggota = (TextView) findViewById(R.id.tv_namaanggota);
        tv_emailanggota = (TextView) findViewById(R.id.tv_emailanggota);
        tv_buku = (TextView) findViewById(R.id.tv_buku);
        tv_author = (TextView) findViewById(R.id.tv_author);
        tv_publisher = (TextView) findViewById(R.id.tv_publisher);
        tv_tglkembali = (TextView ) findViewById(R.id.tv_tglkembali);
        tv_tglpinjam = (TextView) findViewById(R.id.tv_tglpinjam);


        Bundle extras = getIntent().getExtras();
        id = extras.getString(id);
        tv_emailanggota.setText(id);
        String cek = tv_emailanggota.getText().toString().trim();


        if (!TextUtils.isEmpty(cek)){
            user =  new User(cek);
            tv_namaanggota.setText(user.getNamalengkap());
            tv_noanggota.setText(user.getId());
        }

        String id_m = tv_noanggota.getText().toString().trim();
        pinjaman = new Pinjaman(id_m);
        String a = pinjaman.getCek();
        if (a == "1"){
            tv_buku.setText(pinjaman.getBuku().getJudulbuku());
            tv_author.setText(pinjaman.getBuku().getAuthor());
            tv_publisher.setText(pinjaman.getBuku().getPublisher());
            tv_tglpinjam.setText(pinjaman.getTglpinjam());
            tv_tglkembali.setText(pinjaman.getTglkembali());

        }
        else {
            tv_buku.setText("Tidak Ada Pinjaman");
            tv_tglpinjam.setText(" ");
            tv_tglkembali.setText( " ");
        }
    }


}
