package com.example.aplicacionactivities_13_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class formularioregistroActivity extends AppCompatActivity {

    static final String EXTRA_MAIL ="MAIL";
    static final String EXTRA_PASS ="PASS";
    static final String EXTRA_USER ="USER";

    EditText etMailreg,etPassreg,etUserreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formularioregistro);

        etMailreg = (EditText)findViewById(R.id.etmailreg);
        etPassreg = (EditText)findViewById(R.id.etpassreg);
        etUserreg = (EditText)findViewById(R.id.etusuarioreg);




    }//FIN ONCREATE

public void clickregistro (View view) {
    String mail = etMailreg.getText().toString();
    String pass = etPassreg.getText().toString();
    String usuario = etUserreg.getText().toString();

    if (mail.equals("") || pass.equals("") || usuario.equals("")) {
        Toast.makeText(getApplicationContext(), "Debes rellenar el formulario", Toast.LENGTH_LONG).show();

    } else {

        Intent destformu = new Intent(getApplicationContext(),DestinoformularioActivity.class);

        destformu.putExtra(EXTRA_MAIL, mail);
        destformu.putExtra(EXTRA_PASS, pass);
        destformu.putExtra(EXTRA_USER, usuario);

        startActivity(destformu);



    }
}




}//FIN MAINACTIVITY
