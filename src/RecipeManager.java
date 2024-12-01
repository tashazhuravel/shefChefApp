import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeManager {
    private List<Recipe> recipes;

    public RecipeManager() {
        recipes = new ArrayList<>();
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }
}

