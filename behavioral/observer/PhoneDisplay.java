package behavioral.observer;

public class PhoneDisplay implements Observer {
    public void update(String event) { System.out.println("Телефон отримав сповіщення: " + event); }
}