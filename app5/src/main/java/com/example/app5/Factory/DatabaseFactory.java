package com.example.app5.Factory;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.app5.Util.BancoUtil;

/**
 * Created by opet on 04/04/2018.
 */

// Classe de dados principal, sem ela não fazemos nada em cima do SQLite
public class DatabaseFactory extends SQLiteOpenHelper {

    // Construtores obrigatórios da herança SQLiteOpenHelper

    public DatabaseFactory(Context context) {
        super(context, BancoUtil.NOME_BANCO, null, BancoUtil.VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /* Criar tabela usuário 1..n contatos */

        // CREATE TABLE CONTATO ( _ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME TEXT, TELEFONE TEXT, CELULAR TEXT, CONHECIDODE TEXT);
        String sql = "CREATE TABLE " + BancoUtil.TABELA_CONTATO + "("
                + BancoUtil.ID_CONTATO + " integer primary key autoincrement,"
                + BancoUtil.NOME + " text"
                + BancoUtil.TELEFONE + " text,"
                + BancoUtil.CELULAR + " text,"
                + BancoUtil.CONHECIDO_DE + " text"
                + ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // ATENÇÃO: essa estratégia elimina os dados
        db.execSQL("DROP TABLE IF EXISTS " + BancoUtil.TABELA_CONTATO);
        onCreate(db);
    }

}
