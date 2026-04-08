package behavioral.memento;

public class ClimateControl {
    private int temperature;
    public void setTemperature(int t) {
        this.temperature = t;
        System.out.println("Клімат-контроль: " + t + " градусів.");
    }
    public ClimateMemento save() { return new ClimateMemento(temperature); }
    public void restore(ClimateMemento m) {
        this.temperature = m.getTemperature();
        System.out.println("Клімат-контроль відновлено: " + temperature + " градусів.");
    }
}