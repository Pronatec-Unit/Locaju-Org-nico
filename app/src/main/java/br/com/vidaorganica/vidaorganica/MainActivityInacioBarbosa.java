package br.com.vidaorganica.vidaorganica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityInacioBarbosa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inacio_barbosa);

        Button sair = (Button) findViewById(R.id.buttonSair);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityInacioBarbosa.this,MainActivityListaFeiraOrganizadas.class);
                startActivity(intent);

                MainActivityInacioBarbosa.this.finish();
            }
        });
    }
}
