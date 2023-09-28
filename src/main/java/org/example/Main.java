package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person student1 = new Student("John");
        student1.getName();

        Person hourlyEmployee1 = new HourlyEmployee("Briana") {
        };

        System.out.println(student1.getName());

        System.out.println(hourlyEmployee1.getName());

        Clothing[] clothingItems1 = {
                new Clothing("Flannel shirt", 50.00, Size.SMALL),
        };

        System.out.println(clothingItems1[0].getDescription());



    }
}