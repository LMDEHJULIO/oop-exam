package org.example;

public class Student extends Person {
    private long studentID;

    final private double DISCOUNT = .5;

    public Student(String name) {
        super(name);
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }
}
