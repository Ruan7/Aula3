package br.edu.ifsc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calcula(View view) {

        TextView texto1 = findViewById(R.id.editText);
        TextView texto2 = findViewById(R.id.editText2);
        TextView texto3 = findViewById(R.id.textView);

        double a = Double.parseDouble(texto1.getText().toString());
        double b = Double.parseDouble(texto2.getText().toString());
        double imc = a / Math.pow(b,2);
        String valor = String.valueOf(imc);
        texto3.setText(valor);

    }
}
