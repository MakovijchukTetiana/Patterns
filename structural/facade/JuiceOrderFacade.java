package structural.facade;

class FruitStock {
    boolean checkFruits(String fruit) { return true; }
}
class JuicerMachine {
    void squeeze(String fruit) { System.out.println("Вичавлюємо сік з: " + fruit); }
}
class Delivery {
    void arrangeDelivery(String address) { System.out.println("Кур'єр везе сік на: " + address); }
}

public class JuiceOrderFacade {
    private FruitStock stock = new FruitStock();
    private JuicerMachine juicer = new JuicerMachine();
    private Delivery delivery = new Delivery();

    public void placeOrder(String fruit, String address) {
        System.out.println("Отримано нове замовлення...");
        if (stock.checkFruits(fruit)) {
            juicer.squeeze(fruit);
            delivery.arrangeDelivery(address);
            System.out.println("Замовлення успішно виконано!");
        }
    }
}