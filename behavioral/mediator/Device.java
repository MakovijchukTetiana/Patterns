package behavioral.mediator;

public abstract class Device {
    protected SmartHub hub;
    public Device(SmartHub hub) { this.hub = hub; }
}