package behavioral.template;

public abstract class DailyRoutine {
    public final void startRoutine() { turnOnDevices(); makeCoffee(); customAction(); }
    private void turnOnDevices() { System.out.println("Рутина: Вмикаю світло та жалюзі."); }
    private void makeCoffee() { System.out.println("Рутина: Кавоварка готує еспресо."); }
    protected abstract void customAction();
}