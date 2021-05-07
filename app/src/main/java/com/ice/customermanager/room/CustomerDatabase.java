package com.ice.customermanager.room;

import android.content.Context;

import androidx.room.RoomDatabase;
import androidx.room.Database;
import androidx.room.Room;

@Database(entities = {CustomerEntity.class}, version = 1, exportSchema = true)
public abstract class CustomerDatabase extends RoomDatabase {
    public static final String DB_Name = "CustomerDatabase.db";
    private static volatile CustomerDatabase instance;

    public static synchronized CustomerDatabase getInstance(Context context){
        if(instance == null){
            instance = createInstance(context);
        }
        return instance;
    }

    private static CustomerDatabase createInstance(Context context){
        return Room.databaseBuilder(context, CustomerDatabase.class, DB_Name).build();
    }

    public abstract DataDao getDataDao();
}
