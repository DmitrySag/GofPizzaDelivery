package com.myCompany.delivery.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class OrderTest {
    private Pizza pizza;
    private Order order;

    @BeforeEach
    public void setUp() {
        pizza = new Pizza("Pepperoni", 10.99);
        order = new Order(pizza, 2);
    }

    @Test
    public void testGetPizza() {
        assertEquals(pizza, order.getPizza());
    }

    @Test
    public void testSetPizza() {
        Pizza newPizza = new Pizza("Mushroom", 8.99);
        order.setPizza(newPizza);
        assertEquals(newPizza, order.getPizza());
    }

    @Test
    public void testGetQuantity() {
        assertEquals(2, order.getQuantity());
    }

    @Test
    public void testSetQuantity() {
        order.setQuantity(3);
        assertEquals(3, order.getQuantity());
    }

    @Test
    public void testGetTotalCost() {
        double expectedCost = 21.98; // 2 Pepperoni pizzas ($10.99 each)
        double actualCost = order.getTotalCost();
        assertEquals(expectedCost, actualCost, 0.001);
    }
}