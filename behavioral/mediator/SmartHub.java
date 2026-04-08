package behavioral.mediator;

public class SmartHub {
    public void notify(String sender, String event) {
        if (sender.equals("Door") && event.equals("Opened")) {
            System.out.println("Хаб: Двері відчинено -> Вмикаю світло в коридорі.");
        }
    }
}