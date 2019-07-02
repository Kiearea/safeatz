package com.example.safEatz.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

public class Allergen {

    @Transient
    public Allergen[] bigEight = new Allergen[] {
            new Allergen("Milk"),
            new Allergen("Eggs"),
            new Allergen("Fish"),
            new Allergen("Shellfish"),
            new Allergen("Tree Nuts"),
            new Allergen("Peanuts"),
            new Allergen("Wheat"),
            new Allergen("Soy"),
    };

    @Id
    @GeneratedValue
    private String id;

    private  String name;

    public Allergen(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Allergen[] getBigEight() {
        return bigEight;
    }

    public void setBigEight(Allergen[] bigEight) {
        this.bigEight = bigEight;
    }
}
