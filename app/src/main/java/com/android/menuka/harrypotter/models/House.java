package com.android.menuka.harrypotter.models;

import android.database.sqlite.SQLiteDatabase;

import com.android.menuka.harrypotter.db_operations.DatabaseHelper;

/**
 * Created by menuka on 1/24/17.
 */

public class House {
    private String name;
    private String founder;
    private static final SQLiteDatabase db = DatabaseHelper.getDB();

    public House(String name, String founder){
        this.name = name;
        this.founder = founder;
    }

    public static void addStudentToDB(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }
}
