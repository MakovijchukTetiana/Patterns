package structural.adapter;

public class FarmAdapter implements JuiceCatalog {
    private OldFarmSystem oldSystem;

    public FarmAdapter(OldFarmSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public String getJuiceInfo() {
        return oldSystem.fetchOldData() + " (Адаптовано для нашого еко-магазину)";
    }
}