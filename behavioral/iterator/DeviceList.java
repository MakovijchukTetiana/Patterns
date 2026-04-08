package behavioral.iterator;

public class DeviceList {
    private String[] devices = {"Лампа", "Телевізор", "Кондиціонер"};
    public Iterator getIterator() { return new DeviceIterator(); }

    private class DeviceIterator implements Iterator {
        int index;
        public boolean hasNext() { return index < devices.length; }
        public Object next() { return hasNext() ? devices[index++] : null; }
    }
}