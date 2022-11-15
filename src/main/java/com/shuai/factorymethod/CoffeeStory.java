package com.shuai.factorymethod;

public class CoffeeStory {
    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(){
        return coffeeFactory.createCoffee();
    }
}
