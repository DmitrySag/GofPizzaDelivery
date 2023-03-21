package com.myCompany.delivery.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderHandlerTest {
    private List<Order> orders;
    private OrderHandler orderHandler;

    @BeforeEach
    public void setUp() {
        orders = new ArrayList<>();
        orders.add(new Order(new Pizza("Pepperoni", 10.99), 2));
        orders.add(new Order(new Pizza("Mushroom", 8.99), 1));
        orderHandler = new OrderHandler(orders);
    }

    @Test
    public void testProcessOrders() {
        double expectedCost = 30.97; // 2 Pepperoni pizzas ($10.99 each) and 1 Mushroom pizza ($8.99)
        double actualCost = orderHandler.processOrders();
        assertEquals(expectedCost, actualCost, 0.001);
    }
}