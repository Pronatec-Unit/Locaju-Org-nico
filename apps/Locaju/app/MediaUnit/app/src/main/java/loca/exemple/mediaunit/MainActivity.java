package loca.exemple.mediaunit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText frmN1;
    private EditText frmN2;
    private Button btCalc;
    private Button btLimp;
    private TextView txtTot;
    private double N1;
    private double N2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frmN1=(EditText) findViewById(R.id.frmN1);
        frmN2 = (EditText)findViewById(R.id.frmN2);
        btCalc = (Button) findViewById(R.id.btCalc);
        btLimp = (Button) findViewById(R.id.btLimp);
        txtTot= (TextView) findViewById(R.id.txtTot);
        btCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                N1 = Double.parseDouble(frmN1.getText().toString());
                N2 = Double.parseDouble(frmN2.getText().toString());
            }
        });

    }
}
