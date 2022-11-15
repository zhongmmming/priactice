package com.shuai.factorymethod;

public class BadCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new BadCoffee();
    }
}
