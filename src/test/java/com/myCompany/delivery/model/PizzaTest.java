package com.myCompany.delivery.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    public void testProcessOrders() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(new Pizza("Margherita", 8.99), 2));
        orders.add(new Order(new Pizza("Pepperoni", 10.99), 1));
        orders.add(new Order(new Pizza("Veggie", 9.99), 3));

        OrderHandler orderHandler = new OrderHandler(orders);

        double expectedTotalCost = 58.94;

        assertEquals(expectedTotalCost, orderHandler.processOrders(), 0.01);
    }
}