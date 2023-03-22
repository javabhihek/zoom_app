package com.example.zoom_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_joinmain;
    Button btn_signinmain;
    Button btn_signupmain;
    Button btn_settingmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_joinmain=findViewById(R.id.btn_joinmain);
        btn_signinmain=findViewById(R.id.btn_signinmain);
        btn_signupmain=findViewById(R.id.btn_sinupmain);
        btn_settingmain=findViewById(R.id.btn_settingmain);

        btn_joinmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Joinmeeting_screen.class);
                startActivity(i);
            }
        });
        btn_signinmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Login_screen.class);
                startActivity(i);
            }
        });
        btn_signupmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,signup_screen.class);
                startActivity(i);
            }
        });
        btn_settingmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,SettingScreen.class);
                startActivity(i);
            }
        });
    }
}