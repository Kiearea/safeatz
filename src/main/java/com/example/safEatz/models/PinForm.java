package com.example.safEatz.models;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

public class PinForm {

    @NotNull
    private Double lat;

    @NotNull
    private Double lng;

    @NotNull
    private String restaurantName;

    @NotNull
    private String description;

    @NotNull
    private List<Integer> allergenIds;

    private List<Allergen> availableAllergens = Arrays.asList(Allergen.bigEight);

    public PinForm() {

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

    public List<Integer> getAllergenIds() {
        return allergenIds;
    }

    public void setAllergenIds(List<Integer> allergenIds) {
        this.allergenIds = allergenIds;
    }
}
