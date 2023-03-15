package com.myCompany.delivery.model;


import java.util.HashMap;
import java.util.Map;
/**
 * Factory class for creating Pizza objects
 */
public class PizzaFactory {
    private static final Map<String, Pizza> pizzas = new HashMap<>();

    /**
     * Creates a new Pizza object with the given name and price, or returns an existing one
     * with the same name if it already exists.
     * @param name the name of the pizza
     * @param price the price of the pizza
     * @return the created or existing Pizza object
     */
    public static Pizza createPizza(String name, double price) {
        if (!pizzas.containsKey(name)) {
            pizzas.put(name, new Pizza(name, price));
        }
        return pizzas.get(name);
    }
}