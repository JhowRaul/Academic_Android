package com.example.app4;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class MainActivity extends Activity {

    private EditText textNomeDoProjetoInput;
    private TextView textDataInicioInput;
    private TextView textDataEntregaInput;
    private CheckBox checkBoxFinalizadoInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNomeDoProjetoInput = (EditText) findViewById(R.id.textNomeDoProjetoInput);
        textDataInicioInput = (TextView) findViewById(R.id.textDataInicioInput);
        textDataEntregaInput = (TextView) findViewById(R.id.textDataEntregaInput);
        checkBoxFinalizadoInput = (CheckBox) findViewById(R.id.checkBoxFinalizadoInput);

        /* Data inicio */

        final Calendar dataInicio = Calendar.getInstance();

        final DatePickerDialog.OnDateSetListener dateInicio = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                dataInicio.set(Calendar.YEAR, year);
                dataInicio.set(Calendar.MONTH, month);
                dataInicio.set(Calendar.DAY_OF_MONTH, dayOfMonth);

                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

                textDataInicioInput.setText(format.format(dataInicio.getTime()));
            }
        };

        textDataInicioInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(MainActivity.this, dateInicio, dataInicio.get(Calendar.YEAR), dataInicio.get(Calendar.MONTH), dataInicio.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        /* Data final */

        final Calendar dataFinal = Calendar.getInstance();

        final DatePickerDialog.OnDateSetListener dateFinal = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                dataFinal.set(Calendar.YEAR, year);
                dataFinal.set(Calendar.MONTH, month);
                dataFinal.set(Calendar.DAY_OF_MONTH, dayOfMonth);

                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

                textDataEntregaInput.setText(format.format(dataFinal.getTime()));
            }
        };

        textDataEntregaInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(MainActivity.this, dateFinal, dataFinal.get(Calendar.YEAR), dataFinal.get(Calendar.MONTH), dataFinal.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }

    public void salvar(View v) {
        Projeto projeto = new Projeto();

        String nomeProjeto = textNomeDoProjetoInput.getText().toString();
        String dataInicio = textDataInicioInput.getText().toString();
        String dataEntrega = textDataEntregaInput.getText().toString();
        Boolean finalizado = checkBoxFinalizadoInput.isEnabled();
    }

}
