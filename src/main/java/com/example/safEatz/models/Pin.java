package com.example.safEatz.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity// This tells Hibernate to make a table out of this class
public class Pin {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Size(min=1)
    private String restaurantName;

    @NotNull
    @Size(min=1)
    private String description;

//    private Allergen allergen;

    //@ManyToOne //connects the pins to the user
    //private User user;

    private Double lat;

    private Double lng;


    public Pin() { }


    public Pin(Integer id, String restaurantName, String description, Allergen allergen, Double lat, Double lng) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.description = description;
//        this.allergen = allergen;
        this.lat = lat;
        this.lng = lng;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}


