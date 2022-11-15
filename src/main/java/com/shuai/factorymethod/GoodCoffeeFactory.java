package com.shuai.factorymethod;

public class GoodCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new GoodCoffe();
    }
}
