package br.com.vidaorganica.vidaorganica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);

        Button buttonEntrar = (Button) findViewById(R.id.buttonEntrar);

        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(MainActivityPrincipal.this,MainActivityListaFeiraOrganizadas.class);
                startActivity(intent);

                MainActivityPrincipal.this.finish();
            }
        });

        public void onBackPressed(){
            MainActivityPrincipal.this.finish();
        }
    }

}
