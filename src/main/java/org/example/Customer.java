package org.example;

public class Customer extends Person {

    public Customer(String name) {
        super(name);
    }

    public void printCustomerName(Customer customer){
        System.out.println(this.getName());
    }

    @Override
    public String toString(){
        return this.getName();
    }
}