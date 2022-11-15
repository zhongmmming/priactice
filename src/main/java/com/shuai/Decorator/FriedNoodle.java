package com.shuai.Decorator;

public class FriedNoodle extends FastFood{

    public FriedNoodle() {
        super(12, "炒面");
    }

    public float cost(){
        return getPrice();
    }
}
