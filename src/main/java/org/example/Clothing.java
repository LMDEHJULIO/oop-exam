package org.example;

public class Clothing {

    private String description;
    private double price;
    private Size size;

    public Clothing(String desc, double price, Size size){
        this.description = desc;
        this.price = price;
        this.size = size;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    public Size getSize(){
        return this.size;
    }

    public String toString(String input){
        return this.description + this.price + this.size;
    }
}
