package com.example.sudeep.listt;

import java.lang.reflect.Constructor;

public class Food {
    private int _id;
    private String _name;
    private int _price;

        public Food(){

        }
    public Food(String name,int price){
        this._name = name;
        this._price=price;


    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_price(int _price) {
        this._price = _price;
    }

    public int get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }

    public int get_price() {
        return _price;
    }
}
