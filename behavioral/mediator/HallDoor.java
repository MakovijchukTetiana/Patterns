package behavioral.mediator;

public class HallDoor extends Device {
    public HallDoor(SmartHub hub) { super(hub); }
    public void open() {
        System.out.println("Двері в коридор відкриваються...");
        hub.notify("Door", "Opened");
    }
}