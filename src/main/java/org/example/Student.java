package org.example;

public class Student extends Person implements Discountable{
    private long studentID;

    final private double DISCOUNT = .5;

    public Student(String name) {
        super(name);
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public double calculateDiscount(Clothing clothingItem) {
        return clothingItem.getPrice() * (clothingItem.getPrice() * this.getDISCOUNT());
    }
}
