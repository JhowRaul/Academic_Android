package com.example.app5.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.app5.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void carregaItemMenu(View v) {
        switch (v.getId()) {
            case R.id.buttonInserir:
                carregarIntent(NovoActivity.class);
                break;
            case R.id.buttonListar:
                carregarIntent(ListaActivity.class);
                break;
        }
    }

    private void carregarIntent(Class classe){
        Intent intent = new Intent(MainActivity.this,classe);
        startActivity(intent);
    }


}
