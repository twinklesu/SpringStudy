package com.example.hackingspringboot.reactive;

public class Dish {

    private String description;
    private boolean delivered = false;

    public Dish(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public static Dish deliver(Dish dish) {
        Dish deliveredDish = new Dish(dish.description);
        deliveredDish.delivered = true;
        return deliveredDish;
    }

    @Override
    public String toString() {
        return "Dish{description='" + description + "', delivered=" + delivered + "}";
    }
}
