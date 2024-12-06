import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CookBook {
    private final List<Recipe> recipes;

    public CookBook() {
        recipes = new ArrayList<>();
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    //Сохранения рецептов в файл
    public void saveRecipe(String filename){
        try (BufferedWriter writer = new BufferedWriter( new FileWriter(filename))){
            if (recipes.isEmpty()){
                writer.write("Нет доступных рецептов.");
            } else {
                for (Recipe recipe : recipes){
                    writer.write(recipe.toString());
                    writer.newLine();
                    writer.newLine(); // добавила пустую строку между рецептами, не уверена, что нужно. Но красивоЕ.
                }
            }
            System.out.println("Рецепт успешно сохранен в файл: " + filename);
        }catch (IOException e){
            System.err.println("Ошибка сохранения рецепта." + e.getMessage());
        }
    }
}

