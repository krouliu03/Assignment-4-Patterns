package com.aleke.alibi;

public class FactoryLevelA implements Factory {
    public static Animal createAnimal(String newAnimalType){
        if (newAnimalType.equalsIgnoreCase("Dog")){
            return new Dog("Businka");
        }
        else
        if (newAnimalType.equalsIgnoreCase("Cat")){
            return new Cat("Chernysh");
        }
        else
            return null;
    }
}