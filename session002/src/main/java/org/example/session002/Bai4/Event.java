package org.example.session002.Bai4;

public class Event {
    private int id;
    private String name;
    private String eventDate;
    private double price;
    private int remainingTickets;


    public Event(int id, String eventDate, String name, double price, int remainingTickets) {
        this.id = id;
        this.eventDate = eventDate;
        this.name = name;
        this.price = price;
        this.remainingTickets = remainingTickets;
    }

    public String getEventDate() {
        return eventDate;
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

    public int getRemainingTickets() {
        return remainingTickets;
    }
}
