package com.edu.session05.common;

public class Dish {
    private Long id;
    private String name;
    private Double price;
    private boolean isAvailable;

    public Dish(Long id, String name, Double price, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public Double getPrice() { return price; }
    public boolean isAvailable() { return isAvailable; }
}