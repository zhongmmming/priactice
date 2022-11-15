package com.shuai.Decorator;

public abstract class FastFood {
    private float price;
    private String Desc;

    public FastFood(){

    }

    public FastFood(float price, String desc) {
        this.price = price;
        Desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
