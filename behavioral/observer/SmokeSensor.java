package behavioral.observer;
import java.util.ArrayList;
import java.util.List;

public class SmokeSensor {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o) { observers.add(o); }
    public void detectSmoke() {
        System.out.println("Датчик: Виявлено дим!");
        for (Observer o : observers) o.update("Увага! Пожежна тривога!");
    }
}