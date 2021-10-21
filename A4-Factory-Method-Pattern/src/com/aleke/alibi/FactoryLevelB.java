package com.aleke.alibi;

public class FactoryLevelB implements Factory {
    public static Animal createAnimal(String newAnimalType){
        if (newAnimalType.equals("Bird")){
            return new Bird("Ksusha");
        }
        else
        if (newAnimalType.equals("Dog")){
            return new Dog("Baron");
        }
        else
            return null;
    }
}
