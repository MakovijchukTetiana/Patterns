package structural.decorator;

public abstract class DrinkDecorator implements DrinkOrder {
    protected DrinkOrder decoratedOrder;
    public DrinkDecorator(DrinkOrder order) { this.decoratedOrder = order; }
}