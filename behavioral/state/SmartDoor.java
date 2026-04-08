package behavioral.state;

public class SmartDoor {
    private DoorState state;
    public void setState(DoorState state) { this.state = state; }
    public void touch() { state.action(); }
}