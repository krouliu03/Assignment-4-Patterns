package com.aleke.alibi;

public class Bird extends Animal {
    public Bird(String name) {
        setName(name);
    }

    public void displayAnimalAge(){
        if (getAge() > 1){
            System.out.println(getName() + " is " + getAge() + " years old");
        }else {
            System.out.println(getName() + " is " + getAge() + " year old");
        }
    }
    @Override
    public void move() {
        System.out.println("Bird moves using wings");
    }
}
