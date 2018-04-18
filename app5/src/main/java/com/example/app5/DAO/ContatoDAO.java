package com.example.app5.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.app5.Factory.DatabaseFactory;
import com.example.app5.Util.BancoUtil;

/**
 * Created by Jhow on 18/04/2018.
 */

public class ContatoDAO {

    private SQLiteDatabase db;
    private DatabaseFactory factory;


    public ContatoDAO(Context context) {
        factory = new DatabaseFactory(context);
    }

    public long insereDados(Contato contato) {
        ContentValues valores;
        long resultado;

        db = factory.getWritableDatabase();
        valores = new ContentValues();
        valores.put(BancoUtil.NOME_CONTATO, contato.getNome());
        valores.put(BancoUtil.CONHECIDO_DE_CONTATO, contato.getConhecidoDe());

        resultado = db.insert(BancoUtil.TABELA_CONTATO, null, valores);
        db.close();

        return resultado;
    }

}
