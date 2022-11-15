package com.shuai.factorymethod;

public class BadCoffee implements Coffee{
    @Override
    public void getName() {
        System.out.println("badcoffee");
    }

    @Override
    public void addMilk() {

    }

    @Override
    public void addSugar() {

    }
}
