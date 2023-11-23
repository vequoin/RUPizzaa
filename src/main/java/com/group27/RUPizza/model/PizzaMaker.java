package com.group27.RUPizza.model;

public class PizzaMaker {
    public static Pizza createPizza(String pizzaType) {
        return switch (pizzaType) {
            case "Deluxe" -> new Deluxe();
            case "Supreme" -> new Supreme();
            case "Meatzza" -> new Meatzza();
            case "Pepperoni" -> new Pepperoni();
            case "Seafood" -> new Seafood();
            case "BuildYourOwn" -> new BuildYourOwn();
            default -> throw new IllegalArgumentException("Unknown pizza type: " + pizzaType);
        };
    }
}
