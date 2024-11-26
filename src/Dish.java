
import java.util.List;

public class Dish {
    private String name;
    private List<Ingredient> ingredients;

    public Dish(String name, List<Ingredient> ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName(){
        return name;
    }

    public List<Ingredient> getIngredients(){
        return ingredients;
    }
    public double calculateTotalCalories(){
        double totalCalories = 0.0;
        for (Ingredient ingredient : ingredients){
            totalCalories += ingredient.calculateCalories();
        }
        return totalCalories;
    }


}
