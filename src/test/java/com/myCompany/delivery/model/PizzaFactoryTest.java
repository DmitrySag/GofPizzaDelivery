package com.myCompany.delivery.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaFactoryTest {

    @Test
    public void testCreatePizza() {
        Pizza margherita = PizzaFactory.createPizza("Margherita", 8.99);
        assertEquals("Margherita", margherita.getPizzaType());
        assertEquals(8.99, margherita.getPrice(), 0.001);

        Pizza pepperoni = PizzaFactory.createPizza("Pepperoni", 10.99);
        assertEquals("Pepperoni", pepperoni.getPizzaType());
        assertEquals(10.99, pepperoni.getPrice(), 0.001);

        Pizza veggie = PizzaFactory.createPizza("Veggie", 9.99);
        assertEquals("Veggie", veggie.getPizzaType());
        assertEquals(9.99, veggie.getPrice(), 0.001);
    }
}