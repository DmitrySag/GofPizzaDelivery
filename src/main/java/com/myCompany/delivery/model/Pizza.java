package com.myCompany.delivery.model;

public class Pizza {
    private String pizzaType;
    private double price;

    public Pizza(String pizzaType, double price) {
        this.pizzaType = pizzaType;
        this.price = price;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
