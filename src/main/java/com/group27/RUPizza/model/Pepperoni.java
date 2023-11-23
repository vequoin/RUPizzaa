package com.group27.RUPizza.model;public class Pepperoni {
  public Pepperoni(){
        super();
        addTopping(Topping.PEPPERONI);
        setSauce(Sauce.TOMATO);
    }


    @Override
    public double price() {
        return 10.99;
    }
}
