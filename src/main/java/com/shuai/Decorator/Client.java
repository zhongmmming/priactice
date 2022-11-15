package com.shuai.Decorator;

public class Client {
    public static void main(String[] args) {
        FriedNoodle noodle = new FriedNoodle();
        Egg eggnoodle = new Egg(noodle);
        System.out.println(eggnoodle.cost());
    }
}
