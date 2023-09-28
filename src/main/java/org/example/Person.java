package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Person {


    private String name;
    private Clothing[] clothingItems;
    private Size size;


    public Clothing[] getClothingItems(){
        return this.clothingItems;
    }


//    public setClothingItems(){
//        this.
//    }
//
    public void addClothingItem(Clothing clothingItem){
        List<Clothing> list = new ArrayList<>(Arrays.asList(clothingItems));
        list.add(clothingItem);

        clothingItems = list.toArray(new Clothing[0]);
    }
////
//    public removeClothingItem(){
//        this.clothingItems.filter()
//    }


    public String getName(){
        return this.name;
    }



     public Person(String name){ // When you create a new person, you only provide the name
         this.name = name;       // If its not added in the constructor, you
                                // can make a getter to add clothes/size later
    }
}
