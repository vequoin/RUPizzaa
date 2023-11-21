package com.group27.RUPizza.model;

public enum Topping {
    PEPPERONI("Spicy Italian Pepperoni"),
    MUSHROOMS("Fresh Mushrooms"),
    ONIONS("Chopped Onions"),
    SAUSAGE("Italian Sausage"),
    BACON("Crispy Bacon"),
    EXTRA_CHEESE("Extra Cheese"),
    BLACK_OLIVES("Black Olives"),
    GREEN_PEPPERS("Green Bell Peppers"),
    PINEAPPLE("Tropical Pineapple"),
    SPINACH("Fresh Spinach");

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
