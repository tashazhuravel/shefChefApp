import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String dishName;
    private List<Ingredient> ingredients;

    public Recipe(String dishName){
        this.dishName = dishName;
        this.ingredients = new ArrayList<>();
    }
    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }
    public String getDishName(){
        return dishName;
    }
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
