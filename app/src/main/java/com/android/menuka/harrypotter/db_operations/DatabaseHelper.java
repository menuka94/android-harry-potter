package com.android.menuka.harrypotter.db_operations;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by menuka on 1/24/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    private static SQLiteDatabase db;
    private static final String DATABASE_NAME = "hogwarts.db";
    private static final int DATABASE_VERSION = 1;

    public static SQLiteDatabase getDB(){
        return DatabaseHelper.db;
    }

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    private static final String SQL_CREATE_STUDENTS = "create table students if not exists (" +
            "_ID INTEGER PRIMARY KEY, first_name TEXT, last_name TEXT, age INTEGER, house_id INTEGER)";

    private static final String SQL_CREATE_HOUSES = "create table houses if not exists (" +
            "_ID INTEGER PRIMARY KEY, name TEXT, founder TEXT)";

    private static final String SQL_CREATE_PROFESSORS = "create table professors if not exists (" +
            "_ID INTEGER PRIMARY KEY, first_name TEXT, last_name TEXT)";

    private static final String SQL_CREATE_SUBJECTS = "create table subjects if not exists (" +
            "_ID INTEGER PRIMARY KEY, name TEXT)";

    private static final String SQL_CREATE_MAGICAL_CREATURES = "create table magical_creatures if not exists (" +
            "_ID INTEGER PRIMARY KEY, name TEXT, type TEXT, description TEXT)";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_HOUSES);
        db.execSQL(SQL_CREATE_STUDENTS);
        db.execSQL(SQL_CREATE_PROFESSORS);
        db.execSQL(SQL_CREATE_SUBJECTS);
        db.execSQL(SQL_CREATE_MAGICAL_CREATURES);

        DatabaseHelper.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
