package com.shuai.cofig_fatory;

import com.shuai.factorymethod.Coffee;

public class Client {
    public static void main(String[] args) {
        Coffee good = CoffeeFactory.createCoffee("good");
        System.out.println(good);
        good.getName();

    }
}
