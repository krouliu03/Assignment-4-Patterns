package com.aleke.alibi;

public class Dog extends Animal {

    public Dog(String name){
        setName(name);
    }

    public void displayAnimalAge() {
        if (getAge() > 1) {
            System.out.println(getName() + " is " + getAge() + " years old");
        } else {
            System.out.println(getName() + " is " + getAge() + " year old");
        }
    }

    @Override
    public void move() {
        System.out.println("Dog moves on all fours");
    }
}