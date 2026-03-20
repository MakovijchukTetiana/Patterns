package structural.composite;

public class JuicePack implements BoxItem {
    private double price;
    public JuicePack(double price) { this.price = price; }
    public double getPrice() { return price; }
}