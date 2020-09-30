package mx.edu.tesoem.isc.ubb.a7s212021prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AlcuadradoActivity extends AppCompatActivity {

    EditText num1;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcuadrado);

        num1 = findViewById(R.id.txtnum1);
        resultado = findViewById(R.id.lblresul);
    }

    public void pcalcular(View v){
        int vnum1 = Integer.parseInt( num1.getText().toString());
        resultado.setText("La Elevacion al cuadrado es :" + (vnum1 * vnum1));
    }
}