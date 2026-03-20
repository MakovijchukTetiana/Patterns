package structural.flyweight;
import java.util.HashMap;
import java.util.Map;

class ManufacturerInfo {
    private String name;
    public ManufacturerInfo(String name) { this.name = name; }
}

class ManufacturerFactory {
    private static Map<String, ManufacturerInfo> brands = new HashMap<>();
    public static ManufacturerInfo getBrand(String name) {
        if (!brands.containsKey(name)) { brands.put(name, new ManufacturerInfo(name)); }
        return brands.get(name);
    }
}

public class JuiceCarton {
    private String barcode;
    private ManufacturerInfo brand;

    public JuiceCarton(String barcode, String brandName) {
        this.barcode = barcode;
        this.brand = ManufacturerFactory.getBrand(brandName);
    }
}