package structural.decorator;

public class BasicJuice implements DrinkOrder {
    public String getDescription() { return "Свіжовичавлений яблучний сік"; }
    public double getCost() { return 80.0; }
}