package com.android.menuka.harrypotter.models;

/**
 * Created by menuka on 1/24/17.
 */

public class MagicalCreature {
    private String name;
    private String type;
    private String description;

    public MagicalCreature(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
