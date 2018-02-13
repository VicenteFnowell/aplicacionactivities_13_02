package com.example.aplicacionactivities_13_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DestinoformularioActivity extends AppCompatActivity {

    TextView tvMail,tvPass,tvUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinoformulario);

        tvMail = (TextView)findViewById(R.id.tvmail);
        tvPass = (TextView)findViewById(R.id.tvpass);
        tvUser = (TextView)findViewById(R.id.tvuser);

        Bundle b = getIntent().getExtras();
        if(b!=null){

            String mail = b.getString(formularioregistroActivity.EXTRA_MAIL);
            String pass = b.getString(formularioregistroActivity.EXTRA_PASS);
            String user = b.getString(formularioregistroActivity.EXTRA_PASS);

            tvMail.setText(mail);
            tvPass.setText(pass);
            tvUser.setText(user);
        }



    }//FIN ONCREATE

public void clickregresar (View view){

    Intent menu = new Intent(getApplicationContext(),MainActivity.class);
    startActivity(menu);

}

}//FINMAINACTIVITY
