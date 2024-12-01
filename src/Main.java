import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* Ingredient ingredient = new Ingredient("Fish", 10, 2, "kg");
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(ingredient);
        Dish stake = new Dish("Stake", ingredients);
        stake.getIngredients().add(ingredient);*/
        // Основное меню
        Scanner scanner = new Scanner(System.in);
        RecipeManager recipeManager = new RecipeManager();
        System.out.println("Введите ингредиенты (введите 'Стоп', чтобы завершить ввод):");
        while (true) {
            System.out.println("Основное меню");
            System.out.println("1. Добавить рецепт");
            System.out.println("2. Посмотреть рецепты ");
            System.out.println("3. Сохранить рецепт"); //можно ли сохранить в файл, например?
            System.out.println("4. Найти блюдо по каллориям");
            System.out.println("5. Выход");
            System.out.println("Выберте пункт меню (1-5): ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addRecipe(scanner, recipeManager);
                    break;
                case "2":
                    viewRecipes(recipeManager);
                    break;
              /*  case "3":
                    System.out.println("Введите название рецепта для сохранения: ");
                    String saveRecipe = scanner.nextLine();
                    recipeManager.saveRecipe(saveRecipe);
                    System.out.println("Рецепт успешно сохранен" + saveRecipe + ".");
                    break;
                case "4":
                    searchByCalories(scanner, recipeManager);
                    break;*/
                case "5":
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выюбор. Доступные пункты меню 1-5. Пожалуйста, выберите снова.");
                    break;
            }

        }
    }

    // Добавление блюда
    private static void addRecipe(Scanner scanner, RecipeManager recipeManager) {
        System.out.println("Введите название блюда: ");
        String dishName = scanner.nextLine();
        Recipe recipe = new Recipe(dishName);
        recipeManager.addRecipe(recipe);

    }
    // Просмотр рецепта
    private static void viewRecipes(RecipeManager recipeManager){
        List<Recipe> recipes = recipeManager.getRecipes();
        for (Recipe recipe : recipes){
            System.out.println(recipe.getDishName());
        }
    }

}