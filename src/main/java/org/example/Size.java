package org.example;

public enum Size {
    SMALL,
    MEDIUM,
    LARGE;

    public Size getSize(String size){
        return this.valueOf(size);
    }
}
