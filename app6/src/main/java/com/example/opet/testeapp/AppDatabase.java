package com.example.opet.testeapp;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by opet on 02/05/2018.
 */

@Database(entities = {Lembrete.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract LembreteDAO lembreteDAO();
    private static AppDatabase INSTANCE;

    public static AppDatabase getINSTANCE(Context context) {
        if (INSTANCE == null)
            INSTANCE = Room.databaseBuilder(context, AppDatabase.class, "lembretedb").build();

        return INSTANCE;
    }

}
