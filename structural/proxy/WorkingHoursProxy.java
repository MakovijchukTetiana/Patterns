package structural.proxy;

class RealShop implements ShopAccess {
    public void buyJuice() { System.out.println("Сік успішно продано. Смачного!"); }
}

public class WorkingHoursProxy implements ShopAccess {
    private RealShop realShop;
    private int currentHour;

    public WorkingHoursProxy(int currentHour) { this.currentHour = currentHour; }

    @Override
    public void buyJuice() {
        if (currentHour >= 8 && currentHour < 20) {
            if (realShop == null) { realShop = new RealShop(); }
            realShop.buyJuice();
        } else {
            System.out.println("Відмова: Магазин зачинено. Ми працюємо з 8:00 до 20:00.");
        }
    }
}