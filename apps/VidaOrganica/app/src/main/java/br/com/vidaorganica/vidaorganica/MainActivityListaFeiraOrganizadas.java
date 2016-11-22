package br.com.vidaorganica.vidaorganica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityListaFeiraOrganizadas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lista_feira_organizadas);

        Button farolandia = (Button) findViewById(R.id.farolandia);
        Button mosqueiro = (Button) findViewById(R.id.mosqueiro);
        Button centro = (Button) findViewById(R.id.centro);
        Button inacio_barbosa = (Button) findViewById(R.id.inacio_barbosa);
        Button santa_tereza = (Button) findViewById(R.id.santa_tereza);
        Button atalaia = (Button) findViewById(R.id.atalaia);
        Button treze_julho = (Button) findViewById(R.id.treze_junho);

        farolandia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this, MainActivityFarolandia.class);
                startActivity(intent);
            }
        });

        mosqueiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivityMosqueiro.class);
                startActivity(intent);
            }
        });

        centro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivitycentro.class);
                startActivity(intent);
            }
        });

        inacio_barbosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivityInacioBarbosa.class);
                startActivity(intent);
            }
        });

        santa_tereza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivitySantaTereza.class);
                startActivity(intent);
            }
        });

        atalaia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivityAtalaia.class);
                startActivity(intent);
            }
        });

        treze_julho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivityTrezeJulho.class);
                startActivity(intent);
            }
        });

    }
}