package com.example.app3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Spinner spinnerSelecao;

    private TextView texts1, texts2, texts3, texts4;
    private ImageView img1, img2, img3, img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerSelecao = findViewById(R.id.spinnerGrupos);
        texts1 = findViewById(R.id.textSelecao1);
        texts2 = findViewById(R.id.textSelecao2);
        texts3 = findViewById(R.id.textSelecao3);
        texts4 = findViewById(R.id.textSelecao4);

        img1 = findViewById(R.id.image1);
        img2 = findViewById(R.id.image2);
        img3 = findViewById(R.id.image3);
        img4 = findViewById(R.id.image4);

        final Selecao selecao[];
        selecao = new Selecao[8];

        selecao[0] = new Selecao("Egito","egito");
        selecao[1] = new Selecao("Rússia","russia");
        selecao[2] = new Selecao("Arábia Saudita","arabia");
        selecao[3] = new Selecao("Uruguai","uruguai");
        selecao[4] = new Selecao("Irã","ira");
        selecao[5] = new Selecao("Marrocos","marrocos");
        selecao[6] = new Selecao("Portugal","portugal");
        selecao[7] = new Selecao("Espanha","espanha");

        spinnerSelecao.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        texts1.setText(selecao[0].getNome());
                        img1.setImageResource(getResources().getIdentifier( "@drawable/"+selecao[0].getLogo(),"drawable", MainActivity.this.getPackageName()));
                        texts2.setText(selecao[1].getNome());
                        img2.setImageResource(getResources().getIdentifier("@drawable/"+selecao[1].getLogo(),"drawable", MainActivity.this.getPackageName()));
                        texts3.setText(selecao[2].getNome());
                        img3.setImageResource(getResources().getIdentifier("@drawable/"+selecao[2].getLogo(),"drawable", MainActivity.this.getPackageName()));
                        texts4.setText(selecao[3].getNome());
                        img4.setImageResource(getResources().getIdentifier("@drawable/"+selecao[3].getLogo(),"drawable", MainActivity.this.getPackageName()));
                        break;
                    case 1:
                        texts1.setText(selecao[4].getNome());
                        img1.setImageResource(getResources().getIdentifier("@drawable/"+selecao[4].getLogo(),"drawable", MainActivity.this.getPackageName()));
                        texts2.setText(selecao[5].getNome());
                        img2.setImageResource(getResources().getIdentifier("@drawable/"+selecao[5].getLogo(),"drawable", MainActivity.this.getPackageName()));
                        texts3.setText(selecao[6].getNome());
                        img3.setImageResource(getResources().getIdentifier("@drawable/"+selecao[6].getLogo(),"drawable", MainActivity.this.getPackageName()));
                        texts4.setText(selecao[7].getNome());
                        img4.setImageResource(getResources().getIdentifier("@drawable/"+selecao[7].getLogo(),"drawable", MainActivity.this.getPackageName()));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
