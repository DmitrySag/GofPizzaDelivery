package com.myCompany.delivery.model;

import java.util.List;

public class OrderHandler {
    private List<Order> orders;

    public OrderHandler(List<Order> orders) {
        this.orders = orders;
    }

    public double processOrders() {
        double totalCost = 0;
        System.out.println("Processing orders:");
        for (Order order : orders) {
            Pizza pizza = order.getPizza();
            int quantity = order.getQuantity();
            double cost = pizza.getPrice() * quantity;
            totalCost += cost;
            System.out.println("- " + quantity + " " + pizza.getPizzaType() + " pizza(s) for $" + cost);
        }
        System.out.println("Total cost: $" + totalCost);
        return totalCost;
    }
}
