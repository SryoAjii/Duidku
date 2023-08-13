package com.example.duidku.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.duidku.database.dao.DatabaseDao;
import com.example.duidku.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
