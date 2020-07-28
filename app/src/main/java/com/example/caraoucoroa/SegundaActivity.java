package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class SegundaActivity extends AppCompatActivity {

    Button buttonVoltar;
    ImageView iVMoeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        buttonVoltar = findViewById(R.id.btVoltar);
        iVMoeda = findViewById(R.id.iVMoeda);
        selecionarMoeda();

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }


    public void selecionarMoeda() {

        int randomNumero = new Random().nextInt(2);

        if (randomNumero == 0) {
            iVMoeda.setImageResource(R.drawable.moeda_cara);
            Toast.makeText(getApplicationContext(),"Cara"+randomNumero, Toast.LENGTH_LONG).show();
        } else if (randomNumero == 1){
            iVMoeda.setImageResource(R.drawable.moeda_coroa);
            Toast.makeText(getApplicationContext(),"Coroa"+randomNumero, Toast.LENGTH_LONG).show();
        }

        else{
            Toast.makeText(getApplicationContext(),"Nenhum nem outro"+randomNumero, Toast.LENGTH_LONG).show();
        }


    }


}