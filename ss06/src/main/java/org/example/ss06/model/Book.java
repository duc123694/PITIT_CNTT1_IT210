package org.example.ss06.model;

public class Book {
    private int id;
    private String name;
    private String author;
    private double price;

    public Book() {
    }

    public Book(int id,String author, String name, double price) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
