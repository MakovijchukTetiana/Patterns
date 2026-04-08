package behavioral.strategy;

public class Thermostat {
    private HeatingStrategy strategy;
    public void setStrategy(HeatingStrategy strategy) { this.strategy = strategy; }
    public void applyHeating() { strategy.heat(); }
}