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
        Button sair = (Button) findViewById(R.id.buttonSair);

        farolandia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this, MainActivityFarolandia.class);
                startActivity(intent);
                sairMenu();
            }
        });

        mosqueiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivityMosqueiro.class);
                startActivity(intent);
                sairMenu();
            }
        });

        centro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivitycentro.class);
                startActivity(intent);
                sairMenu();
            }
        });

        inacio_barbosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivityInacioBarbosa.class);
                startActivity(intent);
                sairMenu();
            }
        });

        santa_tereza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivitySantaTereza.class);
                startActivity(intent);
                sairMenu();
            }
        });

        atalaia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivityAtalaia.class);
                startActivity(intent);
                sairMenu();
            }
        });

        treze_julho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivityTrezeJulho.class);
                startActivity(intent);
                sairMenu();
            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this,MainActivityPrincipal.class);
                startActivity(intent);
                 //abrirTela(MainActivityPrincipal);
                sairMenu();
            }
        });

        public void sairMenu(){
        MainActivityListaFeiraOrganizadas.this.finish();
    }

        public void abrirTela(String tela) {
            Intent intent = new Intent(MainActivityListaFeiraOrganizadas.this, tela.class);
            startActivity(intent);
        }

    }


}