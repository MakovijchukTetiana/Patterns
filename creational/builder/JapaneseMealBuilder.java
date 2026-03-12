package creational.builder;

public class JapaneseMealBuilder implements MealBuilder {
    private Meal meal;

    public JapaneseMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void buildDrink() { meal.setDrink("саке"); }

    @Override
    public void buildMainCourse() { meal.setMainCourse("курка теріякі"); }

    @Override
    public void buildSide() { meal.setSide("місо суп"); }

    @Override
    public Meal getMeal() { return meal; }
}