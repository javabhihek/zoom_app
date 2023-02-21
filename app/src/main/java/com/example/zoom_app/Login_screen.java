package com.example.zoom_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_screen extends AppCompatActivity {
    Button btn_signinlogin;
    EditText edt_emaillogin,edt_passwordlogin;
    TextView txt_forgotlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        edt_emaillogin=findViewById(R.id.edt_emaillogin);
        edt_passwordlogin=findViewById(R.id.edt_passwordlogin);
        btn_signinlogin=findViewById(R.id.btn_signinlogin);

        txt_forgotlogin=findViewById(R.id.txt_forgotlogin);
        txt_forgotlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Login_screen.this,ForotScreen.class);
                startActivity(i);
            }
        });
        txt_forgotlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Login_screen.this,ForotScreen.class);
                startActivity(i);
            }
        });

        btn_signinlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailid=edt_emaillogin.getText().toString();
                String password=edt_passwordlogin.getText().toString();
                if(emailid.isEmpty()){
                    Toast.makeText(Login_screen.this, "write your email id", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()) {
                    Toast.makeText(Login_screen.this, "write your login password", Toast.LENGTH_SHORT).show();

                }
                else {
                    Intent i=new Intent(Login_screen.this,meeting_screen.class);

                    i.putExtra("emailid",emailid);
                    i.putExtra("password",password);
                    startActivity(i);
                }
            }
        });
    }
}