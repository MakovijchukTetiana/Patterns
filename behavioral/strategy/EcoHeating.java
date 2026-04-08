package behavioral.strategy;

public class EcoHeating implements HeatingStrategy {
    public void heat() { System.out.println("Опалення: Еко-режим (економія енергії)."); }
}