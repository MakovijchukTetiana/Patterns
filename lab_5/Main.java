package lab_5;

import java.util.function.Function;
import java.util.function.Supplier;

class Thermostat {
    private Runnable strategy;

    public void setStrategy(Runnable strategy) {
        this.strategy = strategy;
    }

    public void applyHeating() {
        if (strategy != null) {
            strategy.run();
        } else {
            System.out.println("Стратегія не встановлена!");
        }
    }
}

interface Transport {
    void deliver();
}

class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Доставка суходолом у коробці");
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Доставка морем у контейнері.");
    }
}

class Logistics {
    public void planDelivery(Supplier<Transport> transportFactory) {
        Transport transport = transportFactory.get();
        transport.deliver();
    }
}

record Drink(String description, double cost) {}


public class Main {
    public static void main(String[] args) {

        System.out.println(" 1. СТРАТЕГІЯ (Strategy) ");
        Thermostat thermostat = new Thermostat();

        thermostat.setStrategy(() -> System.out.println("Опалення: Еко-режим (економія енергії)."));
        thermostat.applyHeating();

        thermostat.setStrategy(() -> System.out.println("Опалення: Швидкий нагрів."));
        thermostat.applyHeating();


        System.out.println("\n 2. ФАБРИЧНИЙ МЕТОД (Factory Method) ");
        Logistics logistics = new Logistics();

        System.out.print("Доставка 1: ");
        logistics.planDelivery(Truck::new);

        System.out.print("Доставка 2: ");
        logistics.planDelivery(Ship::new);


        System.out.println("\n 3. ДЕКОРАТОР (Decorator) ");
        Drink basicJuice = new Drink("Свіжовичавлений яблучний сік", 80.0);

        Function<Drink, Drink> addVitaminC = drink ->
                new Drink(drink.description() + " + Подвійна доза Вітаміну С", drink.cost() + 20.0);

        Function<Drink, Drink> addIce = drink ->
                new Drink(drink.description() + " + Лід", drink.cost() + 10.0);

        Function<Drink, Drink> customOrder = addVitaminC.andThen(addIce);
        Drink finalDrink = customOrder.apply(basicJuice);

        System.out.println("Замовлення: " + finalDrink.description());
        System.out.println("До сплати: " + finalDrink.cost() + " грн");


        System.out.println("\n 4. НАВКОЛИШНЄ ВИКОНАННЯ (Execute Around) ");
        executeWithTimer(() -> {
            System.out.println("Виконується складний розрахунок...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    // Метод для патерну Навколишнє виконання
    public static void executeWithTimer(Runnable action) {
        long startTime = System.currentTimeMillis();
        try {
            action.run();
        } finally {
            long endTime = System.currentTimeMillis();
            System.out.println("-> Час виконання операції: " + (endTime - startTime) + " мс");
        }
    }
}