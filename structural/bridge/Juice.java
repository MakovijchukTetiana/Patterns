package structural.bridge;

public abstract class Juice {
    protected Packaging packaging;
    public Juice(Packaging packaging) { this.packaging = packaging; }
    public abstract void pour();
}