package com.android.menuka.harrypotter.models;

/**
 * Created by menuka on 1/24/17.
 */

public class Student {
    private String firstName;
    private String lastName;
    private House house;
    private int houseId;
    private int age;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
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
