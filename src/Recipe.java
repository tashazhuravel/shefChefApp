import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String dishName;
    private List<Ingredient> ingredients;
    double totalCalories = 0.0;

    public Recipe(String dishName) {
        this.dishName = dishName;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public String getDishName() {
        return dishName;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Рецепт блюда ").append(dishName).append("\n");
        sb.append("Ингредиенты:\n");
        for (Ingredient ingredient : ingredients) {
            sb.append("- ").append(ingredient.getName()).append(" (").append(ingredient.getCount().append(" ")).append(ingredient.getUnits()).append(", ").append(ingredient.calculateCalories()).append(" ккал").append("\n");
        }
        return sb.toString();
    }
}
