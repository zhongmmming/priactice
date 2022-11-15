package com.shuai.factorymethod;

public class GoodCoffe implements Coffee{
    @Override
    public void getName() {
        System.out.println("goodcoffee");
    }

    @Override
    public void addMilk() {

    }

    @Override
    public void addSugar() {

    }
}
