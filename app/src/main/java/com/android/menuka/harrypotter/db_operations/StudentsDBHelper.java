package com.android.menuka.harrypotter.db_operations;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.android.menuka.harrypotter.models.Student;

/**
 * Created by menuka on 1/24/17.
 */

public class StudentsDBHelper {
    private static SQLiteDatabase db = DatabaseHelper.getDB();

    public static void findById(int id){
        String query = "select * from students where _ID=?";
        SQLiteStatement statement = db.compileStatement(query);
        statement.bindString(1, Integer.toString(id));
    }

    public static void addStudent(Student student){
        try {
            String query = "insert into students (first_name, last_name, age, house_id) values (?,?,?,?)";
            SQLiteStatement statement = db.compileStatement(query);

            statement.bindString(1, student.getFirstName());
            statement.bindString(2, student.getLastName());
            statement.bindString(3, Integer.toString(student.getAge()));
            statement.bindString(4, Integer.toString(student.getHouseId()));

            statement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void getAllStudents(){
        try{
            String query = "select * from students";

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void removeStudent(int id){

    }

    public static void updateStudent(Student student){

    }

}
