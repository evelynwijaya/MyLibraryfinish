package com.example.evelyn.mylibrary;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private User user;
    private EditText et_mail, et_pass;
    private Button bt_login;
    private String id = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_mail = (EditText) findViewById(R.id.et_email);
        et_pass = (EditText) findViewById(R.id.et_pass);
        bt_login = (Button) findViewById(R.id.bt_login);
        bt_login.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.bt_login){
            String email = et_mail.getText().toString();
            String password = et_pass.getText().toString();
            user =  new User(email);
            if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                Toast.makeText(getApplicationContext(), "Sukses",
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra(id,user.getEmail());
                MainActivity.this.startActivity(intent);
                finish();

            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Data tidak sesuai!").setNegativeButton("Retry", null).create().show();

            }

        }
    }
}
