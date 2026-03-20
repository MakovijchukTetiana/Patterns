package structural.composite;
import java.util.ArrayList;
import java.util.List;

public class GiftBox implements BoxItem {
    private List<BoxItem> items = new ArrayList<>();

    public void addItem(BoxItem item) { items.add(item); }

    @Override
    public double getPrice() {
        double total = 0;
        for (BoxItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}