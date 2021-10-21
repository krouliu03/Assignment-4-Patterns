package com.aleke.alibi;

public abstract class Animal {
    private String name;
    private int age;

    public void move(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void displayAnimalAge(){}
}
