package structural.decorator;

public class VitaminCDecorator extends DrinkDecorator {
    public VitaminCDecorator(DrinkOrder order) { super(order); }

    @Override
    public String getDescription() { return decoratedOrder.getDescription() + " + Подвійна доза Вітаміну С"; }

    @Override
    public double getCost() { return decoratedOrder.getCost() + 20.0; }
}