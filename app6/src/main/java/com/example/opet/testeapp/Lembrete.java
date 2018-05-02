package com.example.opet.testeapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by opet on 02/05/2018.
 */

@Entity
public class Lembrete {

    @PrimaryKey(autoGenerate = true)
    private long ID;

    private String Lembrete;

    @ColumnInfo(name = "data_lembrete")
    private long dataLembrete;

    public Lembrete () {
    }

    public Lembrete(long ID, String lembrete, long dataLembrete) {
        this.ID = ID;
        Lembrete = lembrete;
        this.dataLembrete = dataLembrete;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getLembrete() {
        return Lembrete;
    }

    public void setLembrete(String lembrete) {
        Lembrete = lembrete;
    }

    public long getDataLembrete() {
        return dataLembrete;
    }

    public void setDataLembrete(long dataLembrete) {
        this.dataLembrete = dataLembrete;
    }
}