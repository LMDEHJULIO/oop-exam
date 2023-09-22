package org.example;

public abstract class Employee extends Customer implements Discountable {
    final double DISCOUNT = .10;

    public Employee(String name) {
        super(name);
    }

    public double printEmployeePriceAfterDiscount(Clothing clothingItem){
            return calculateDiscount(clothingItem);
    }

    @Override
    public double calculateDiscount(Clothing clothingItem) {
        return clothingItem.getPrice() * (clothingItem.getPrice() - this.DISCOUNT);
    }
}
