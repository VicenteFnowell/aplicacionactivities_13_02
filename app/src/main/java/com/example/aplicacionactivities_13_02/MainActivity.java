package com.example.aplicacionactivities_13_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }//FIN ONCREATE


    public void clickaccederformulario (View view){
        Intent formu=new Intent(getApplicationContext(),formularioregistroActivity.class);
        startActivity(formu);

    }



}//FIN MAINACT
