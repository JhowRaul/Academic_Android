package com.example.app2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends Activity {

    private EditText editDespesa;
    private RadioGroup grupoPagamento;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editDespesa = findViewById(R.id.editValor);
        grupoPagamento = findViewById(R.id.grupoPagamento);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcular(View v){
        Double despesa = Double.parseDouble(editDespesa.getText().toString());
        RadioButton selecionado = findViewById(grupoPagamento.getCheckedRadioButtonId());
        DecimalFormat df = new DecimalFormat("#.00");
        switch (selecionado.getId()){
            case R.id.rbVista:
                textResultado.setText("Valor a pagar: " + df.format(despesa * 0.9));
                break;
            case R.id.rbDebito:
                textResultado.setText("Valor a pagar: " + df.format(despesa));
                break;
            case R.id.rbCredito:
                despesa = despesa * 1.05;
                Double valorx1, valorx2, valorx3;
                valorx1 = despesa;
                valorx2 = despesa / 2.0;
                valorx3 = despesa / 3.0;
                String data = "Valor em uma parcela: " + df.format(valorx1);
                data += "\nValor em duas parcelas: " + df.format(valorx2);
                data += "\nValor em três parcelas: " + df.format(valorx3);

                textResultado.setText(data);
        }
    }
}
