package creational;

import creational.singleton.SingletonExample;
import creational.builder.*;
import creational.prototype.*;
import creational.factorymethod.*;

public class Main {
    public static void main(String[] args) {
        //  1. Одинак (Singleton)
        System.out.println(" 1. Одинак (Singleton) ");
        SingletonExample singleton = SingletonExample.getInstance();
        singleton.sayHello();

        //  2. Фабрика (Factory)
        System.out.println("\n 2. Фабрика (Factory) ");
        creational.factory.AnimalFactory animalFactory = new creational.factory.AnimalFactory();
        creational.factory.Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("a1 каже: " + a1.makeSound());
        creational.factory.Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("a2 каже: " + a2.makeSound());

        // 3. Фабричний метод (Factory Method)
        System.out.println("\n 3. Фабричний метод (Factory Method) ");
        Logistics roadLogistics = new RoadLogistics();
        System.out.print("Дорожня логістика: ");
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        System.out.print("Морська логістика: ");
        seaLogistics.planDelivery();

        //  4. Абстрактна фабрика (Abstract Factory)
        System.out.println("\n 4. Абстрактна фабрика (Abstract Factory)");
        creational.abstractfactory.AbstractFactory abstractFactory = new creational.abstractfactory.AbstractFactory();

        creational.abstractfactory.SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
        creational.abstractfactory.Animal a3 = speciesFactory1.getAnimal("tyrannosaurus");
        System.out.println("a3 каже: " + a3.makeSound());

        creational.abstractfactory.SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
        creational.abstractfactory.Animal a4 = speciesFactory2.getAnimal("dog");
        System.out.println("a4 каже: " + a4.makeSound());

        // 5. Будівельник (Builder)
        System.out.println("\n 5. Будівельник (Builder) ");
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        System.out.println("Обід: " + mealDirector.getMeal());

        mealBuilder = new JapaneseMealBuilder();
        MealDirector mealDirector2 = new MealDirector(mealBuilder);
        mealDirector2.constructMeal();
        System.out.println("Обід: " + mealDirector2.getMeal());

        // --- 6. Прототип (Prototype) ---
        System.out.println("\n 6. Прототип (Prototype) ");
        Person person1 = new Person("Фред");
        Person person2 = (Person) person1.doClone();
        System.out.println("Особа 2: " + person2);

        ProtoDog dog1 = new ProtoDog("Гааав!");
        ProtoDog dog2 = (ProtoDog) dog1.doClone();
        System.out.println("Собака 2: " + dog2);
    }
}