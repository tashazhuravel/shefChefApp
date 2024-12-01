
import java.util.List;

public class Dish {
    private final String name;
    private final List<Ingredient> ingredients;
    double totalCalories = 0.0;

    public Dish(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public double calculateTotalCalories() {
        if (totalCalories == 0) {
            for (Ingredient ingredient : ingredients) {
                totalCalories += ingredient.calculateCalories();
            }
        }
        return totalCalories;
    }


}
