package com.android.menuka.harrypotter.models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by menuka on 1/24/17.
 */

@IgnoreExtraProperties
public class Student {
    private String first_name;
    private String last_name;
    private House house;
    private int house_id;
    private int age;

    public Student() {

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
                ", house=" + house +
                ", house_id=" + house_id +
                ", age=" + age +
                '}';
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }

    public int getAge() {
        return age;
    }

    public House getHouse() {
        return house;
    }


    public void setAge(int age) {
        this.age = age;
    }
}
