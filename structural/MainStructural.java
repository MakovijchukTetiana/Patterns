package structural;

import structural.adapter.*;
import structural.bridge.*;
import structural.composite.*;
import structural.decorator.*;
import structural.facade.*;
import structural.proxy.*;

public class MainStructural {
    public static void main(String[] args) {
        System.out.println(" 1. Адаптер ");
        FarmAdapter adapter = new FarmAdapter(new OldFarmSystem());
        System.out.println(adapter.getJuiceInfo());

        System.out.println("\n 2. Міст ");
        Juice myJuice = new OrangeJuice(new GlassBottle());
        myJuice.pour();

        System.out.println("\n 3. Компонувальник");
        GiftBox box = new GiftBox();
        box.addItem(new JuicePack(45.50));
        box.addItem(new JuicePack(60.00));
        System.out.println("Загальна вартість подарункової коробки: " + box.getPrice() + " грн");

        System.out.println("\n 4. Декоратор ");
        DrinkOrder myOrder = new BasicJuice();
        myOrder = new VitaminCDecorator(myOrder);
        System.out.println(myOrder.getDescription() + " | Ціна: " + myOrder.getCost() + " грн");

        System.out.println("\n 5. Фасад ");
        JuiceOrderFacade store = new JuiceOrderFacade();
        store.placeOrder("Морква-Яблуко", "Київ, вул. Студентська 5");

        System.out.println("\n 6. Легковаговик ");
        System.out.println("Пакети соку створено. Дані про бренд закешовано фабрикою, пам'ять зекономлено.");

        System.out.println("\n 7. Замісник ");
        ShopAccess nightCustomer = new WorkingHoursProxy(22); // 22:00
        nightCustomer.buyJuice(); // Має бути відмова

        ShopAccess dayCustomer = new WorkingHoursProxy(14); // 14:00
        dayCustomer.buyJuice(); // Має бути успіх
    }
}