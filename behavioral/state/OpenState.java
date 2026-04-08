package behavioral.state;

public class OpenState implements DoorState {
    public void action() { System.out.println("Двері відчинені. Заходьте."); }
}