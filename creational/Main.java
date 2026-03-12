package creational;

import creational.singleton.SingletonExample;
import creational.builder.*;
import creational.prototype.*;
import creational.factorymethod.*; // Додали імпорт нового патерна

public class Main {
    public static void main(String[] args) {
        //  1. Одинак (Singleton)
        System.out.println(" 1. Singleton ");
        SingletonExample singleton = SingletonExample.getInstance();
        singleton.sayHello();

        //  2. Фабрика (Simple Factory)
        System.out.println("\n 2. Factory ");
        creational.factory.AnimalFactory animalFactory = new creational.factory.AnimalFactory();
        creational.factory.Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("a1 sound: " + a1.makeSound());
        creational.factory.Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("a2 sound: " + a2.makeSound());

        //  3. Фабричний метод (Factory Method)
        System.out.println("\n 3. Factory Method ");
        Logistics roadLogistics = new RoadLogistics();
        System.out.print("Road Logistics: ");
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        System.out.print("Sea Logistics: ");
        seaLogistics.planDelivery();

        //  4. Абстрактна фабрика (Abstract Factory)
        System.out.println("\n 4. Abstract Factory ");
        creational.abstractfactory.AbstractFactory abstractFactory = new creational.abstractfactory.AbstractFactory();
        
        creational.abstractfactory.SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
        creational.abstractfactory.Animal a3 = speciesFactory1.getAnimal("tyrannosaurus");
        System.out.println("a3 sound: " + a3.makeSound());
        
        creational.abstractfactory.SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
        creational.abstractfactory.Animal a4 = speciesFactory2.getAnimal("dog");
        System.out.println("a4 sound: " + a4.makeSound());

        // 5. Будівельник (Builder)
        System.out.println("\n 5. Builder ");
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        System.out.println("meal is: " + mealDirector.getMeal());

        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        System.out.println("meal is: " + mealDirector.getMeal());

        //  6. Прототип (Prototype)
        System.out.println("\n 6. Prototype ");
        Person person1 = new Person("Fred");
        Person person2 = (Person) person1.doClone();
        System.out.println("person 2: " + person2);

        ProtoDog dog1 = new ProtoDog("Wooof!");
        ProtoDog dog2 = (ProtoDog) dog1.doClone();
        System.out.println("dog 2: " + dog2);
    }
}