package org.example;

 public abstract class Customer extends Person {

    public Customer(String name) {
        super(name);
    }

    public void printCustomerName(Customer customer){
        System.out.println(customer.getName());
    }

    @Override
    public String toString(){
        return this.getName();
    }
}