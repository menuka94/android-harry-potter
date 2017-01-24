package com.android.menuka.harrypotter.models;

/**
 * Created by menuka on 1/24/17.
 */

public class House {
    private String name;
    private String founder;

    public House(String name, String founder){
        this.name = name;
        this.founder = founder;
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
