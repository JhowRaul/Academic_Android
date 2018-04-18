package com.example.app5.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app5.DAO.Contato;
import com.example.app5.DAO.ContatoDAO;
import com.example.app5.R;

public class CadastrarContatoActivity extends Activity {

    private EditText editNome;
    private EditText editConheceDe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_contato);

        editNome = (EditText) findViewById(R.id.editNome);
        editConheceDe = (EditText) findViewById(R.id.editConheceDe);
    }

    public void gravarContato(View v) {
        Contato contato = new Contato();

        String nome = editNome.getText().toString();
        String conheceDe = editConheceDe.getText().toString();

        contato.setNome(nome);
        contato.setConhecidoDe(conheceDe);

        ContatoDAO contatoDAO = new ContatoDAO(this);
        long result = contatoDAO.insereDados(contato);
        if(result > 0) {
            Toast.makeText(this, "Contato cadastrado!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(CadastrarContatoActivity.this, CadastrarTelefoneActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            Toast.makeText(this, "Contato não cadastrado.", Toast.LENGTH_SHORT).show();
        }
    }
}
