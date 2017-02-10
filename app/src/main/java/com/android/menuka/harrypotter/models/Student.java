package com.android.menuka.harrypotter.models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by menuka on 1/24/17.
 */

@IgnoreExtraProperties
public class Student {
    private String first_name;
    private String last_name;
    private Long house_id;

    public Student() {

    }

    public Student(String first_name, String last_name, Long house_id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.house_id = house_id;
    }

    public Student(String first_name, String lastName){
        this.first_name = first_name;
        this.last_name = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", house_id=" + house_id +
                '}';
    }

    public String getFirst_name() {
        return first_name;
    }


    public String getLastName() {
        return last_name;
    }


    public Long getHouse_id() {
        return house_id;
    }

    public void setHouse_id(Long house_id) {
        this.house_id = house_id;
    }


}
