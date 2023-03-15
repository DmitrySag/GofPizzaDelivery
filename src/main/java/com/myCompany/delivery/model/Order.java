package com.myCompany.delivery.model;

/**
 * Class representing an order for a pizza
 */
public class Order {
    private Pizza pizza;
    private int quantity;

    /**
     * Creates a new Order object with the given pizza and quantity
     * @param pizza the pizza to order
     * @param quantity the quantity of the pizza to order
     */
    public Order(Pizza pizza, int quantity) {
        this.pizza = pizza;
        this.quantity = quantity;
    }

    /**
     * Gets the pizza for this order
     * @return the pizza for this order
     */
    public Pizza getPizza() {
        return pizza;
    }

    /**
     * Sets the pizza for this order
     * @param pizza the pizza for this order
     */
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Gets the quantity of the pizza for this order
     * @return the quantity of the pizza for this order
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the pizza for this order
     * @param quantity the quantity of the pizza for this order
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Calculates the total cost of this order
     * @return the total cost of this order
     */
    public double getTotalCost() {
        return pizza.getPrice() * quantity;
    }
}
