package com.myCompany.delivery;

import com.myCompany.delivery.model.Order;
import com.myCompany.delivery.model.OrderHandler;
import com.myCompany.delivery.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(new Pizza("Margherita", 8.99), 2));
        orders.add(new Order(new Pizza("Pepperoni", 10.99), 1));
        orders.add(new Order(new Pizza("Veggie", 9.99), 3));

        OrderHandler orderHandler = new OrderHandler(orders);
        orderHandler.processOrders();
    }
}