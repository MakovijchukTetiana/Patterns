package behavioral.state;

public class LockedState implements DoorState {
    public void action() { System.out.println("Двері заблоковані. Потрібен ключ."); }
}