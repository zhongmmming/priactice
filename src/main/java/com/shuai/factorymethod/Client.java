package com.shuai.factorymethod;

public class Client {
    public static void main(String[] args) {
        CoffeeFactory factory = new GoodCoffeeFactory();
        CoffeeStory coffeeStory = new CoffeeStory();
        coffeeStory.setCoffeeFactory(factory);
        System.out.println(coffeeStory.orderCoffee());
    }
}
