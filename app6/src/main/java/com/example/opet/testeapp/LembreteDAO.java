package com.example.opet.testeapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by opet on 02/05/2018.
 */

@Dao
public interface LembreteDAO {

    @Insert
    public long insertLembrete(Lembrete lembrete);

  /*  @Query("SELECT * FROM Lembrete LIMIT :x")
    public List<Lembrete> findAll(int x);  */

    @Query("SELECT * FROM Lembrete")
    public List<Lembrete> findAll();



}
