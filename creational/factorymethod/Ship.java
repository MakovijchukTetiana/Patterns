package creational.factorymethod;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Доставка морем у контейнері.");
    }
}