package creational.factorymethod;

public abstract class Logistics {
    // Той самий фабричний метод, який реалізують нащадки
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}