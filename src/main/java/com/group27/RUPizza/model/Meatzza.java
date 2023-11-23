package com.group27.RUPizza.model;public class Meatzza {
   public Meatzza(){
        addTopping(Topping.PEPPERONI);
        addTopping(Topping.HAM);
        addTopping(Topping.SAUSAGE);
        addTopping(Topping.BEEF);
        setSauce(Sauce.TOMATO);
    }
    @Override
    public double price() {
        return 16.99;
    }
}
