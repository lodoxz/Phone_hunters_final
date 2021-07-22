package com.example.phone_hunters_final.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Smartphone.class}, version=1)

public abstract class SmartphoneDatabase extends RoomDatabase {

    public abstract SmartphoneDao smartphoneDao();
    private static SmartphoneDatabase INSTANCE;

    public static SmartphoneDatabase getInstance(Context context){

        if(INSTANCE==null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), SmartphoneDatabase.class, "smartphonedb")
                    .allowMainThreadQueries()
                    .build();


        }
        return INSTANCE;

    }








}

