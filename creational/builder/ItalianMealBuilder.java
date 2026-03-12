package creational.builder;

public class ItalianMealBuilder implements MealBuilder {
    private Meal meal;

    public ItalianMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void buildDrink() { meal.setDrink("Червоне вино"); }

    @Override
    public void buildMainCourse() { meal.setMainCourse("Піца"); }

    @Override
    public void buildSide() { meal.setSide("Хліб"); }

    @Override
    public Meal getMeal() { return meal; }
}