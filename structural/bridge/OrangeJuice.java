package structural.bridge;

public class OrangeJuice extends Juice {
    public OrangeJuice(Packaging packaging) { super(packaging); }

    @Override
    public void pour() {
        System.out.println("Свіжий апельсиновий сік налито у: " + packaging.getMaterial());
    }
}