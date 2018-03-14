package com.example.opet.academic_android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText editTotal;
    private EditText editPessoas;
    private TextView editResultado;
    private CheckBox checkboxAcresc;
    private Button buttonClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTotal = findViewById(R.id.editTotal);
        editPessoas = findViewById(R.id.editPessoas);
        editResultado = findViewById(R.id.editResultado);
        checkboxAcresc = findViewById(R.id.checkboxAcresc);
        buttonClick = findViewById(R.id.buttonClick);
    }

    public void click(View v) {
        Double total = Double.valueOf(editTotal.getText().toString());
        Double pessoas = Double.valueOf(editPessoas.getText().toString());
        String resultado = String.valueOf(editResultado.getText().toString());

        if (checkboxAcresc.isChecked()) {
            total = total + (total * 0.10);
        }

        Double soma = total / pessoas;
        String exibe = String.valueOf(soma);

        //  resultado = soma.toString();

        String mascara = String.format("R$ %, .2f", soma);
        editResultado.setText(mascara);

        //  Toast.makeText(this, resultado, Toast.LENGTH_LONG).show();

    }
}