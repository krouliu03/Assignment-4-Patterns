package com.aleke.alibi;

//FACTORY METHOD PATTERN

public class Main {
    public static void main(String[] args) {


        Animal animal1 = FactoryLevelA.createAnimal("Cat");
        animal1.setName("Muska");
        animal1.setAge(1);
        animal1.move();
        System.out.print("it's name is " + animal1.getName() + ',' + "and age is " + animal1.getAge() + " years");

        System.out.println("\n****************************************\n");

        Animal animal2 = FactoryLevelB.createAnimal("Dog");
        animal2.setName("Peppa");
        animal1.setAge(3);
        animal2.move();
        System.out.print("it's name is " + animal2.getName() + ',' + "and age is " + animal2.getAge() + " years");
        System.out.println("\n****************************************\n");

        Animal animal3 = FactoryLevelB.createAnimal("Bird");
        animal2.setName("Gaika");
        animal3.setAge(1);
        animal3.move();
        System.out.print("it's name is " + animal3.getName() + ',' + "and age is " + animal3.getAge() + " years");
        System.out.println("\n****************************************\n");
    }
}
