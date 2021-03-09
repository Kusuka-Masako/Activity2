package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnlgn;
    EditText edtuser, edtpw;
    String name, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlgn = findViewById(R.id.btnmsk);
        edtuser = findViewById(R.id.username);
        edtpw = findViewById(R.id.password);

        btnlgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = edtuser.getText().toString();
                password = edtpw.getText().toString();

                if(edtuser.getText().toString().equals("KusukaMasako")&& edtpw.getText().toString().equals("qwerty123")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "LOGIN SUKSES", Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    Toast.makeText((getApplicationContext()), "Username atau Password Salah",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}