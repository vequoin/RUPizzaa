package com.group27.RUPizza.model;

public enum Topping {
   PEPPERONI("Spicy Italian Pepperoni"),
    MUSHROOMS("Fresh Mushrooms"),
    ONIONS("Chopped Onions"),
    SAUSAGE("Italian Sausage"),
    BACON("Crispy Bacon"),
    SHRIMP("Crispy Shrimp"),
    BLACK_OLIVES("Black Olives"),
    GREEN_PEPPERS("Green Bell Peppers"),
    SQUID("Legendary Squid from the ocean deep"),
    CRAB_MEATS("Assorted selection of crabs from Alaska"),
    BEEF("Our grass fed beef"),
    PINEAPPLE("Tropical Pineapple"),
    SPINACH("Fresh Spinach"),
    HAM("Fresh Ham");

    private final String description;

    Topping(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name() + " (" + description + ")";
    }
}
