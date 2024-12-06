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
        CookBook cookBook = new CookBook();
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
                    addRecipe(scanner, cookBook);
                    break;
                case "2":
                    viewRecipes(cookBook);
                    break;
                case "3":
                    System.out.println("Введите название рецепта для сохранения: ");
                    String saveRecipe = scanner.nextLine();
                    cookBook.saveRecipe(saveRecipe);
                    System.out.println("Рецепт успешно сохранен" + saveRecipe + ".");
                    break;
                case "4":
                    searchByCalories(scanner, cookBook);
                    break;
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
    private static void addRecipe(Scanner scanner, CookBook cookBook) {
        System.out.println("Введите название блюда: ");
        String dishName = scanner.nextLine();
        Recipe recipe = new Recipe(dishName);

        while (true) {
            System.out.println("Введите название ингредиента или Stop для завершения: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("Stop")) {
                break;
            }
            System.out.println("Введите калорийность ингредиента: ");
            int calories = scanner.nextInt();

            System.out.println("Введите количество (цифра): ");
            double count = scanner.nextDouble();

            System.out.println("Введите единицы измерения, напрмер вес и объем гр, кг, мл, л и т.д: ");
            String units = scanner.nextLine();

            Ingredient ingredient = new Ingredient(name, calories, count, units);
            recipe.addIngredient(ingredient);
        }
        cookBook.addRecipe(recipe);
        System.out.println("Рецепт добавлен.");
    }

    // Просмотр рецепта
    private static void viewRecipes(CookBook cookBook) {
        List<Recipe> recipes = cookBook.getRecipes();
        if (recipes.isEmpty()) {
            System.out.println("Рецепт не найден. Книга рецептов пуста");
        } else {
            for (Recipe recipe : recipes) {
                System.out.println("Рецепт для блюда: " + recipe.getDishName());
                System.out.println("Ингредиенты: ");
                for (Ingredient ingredient : recipe.getIngredients()) {
                    System.out.println("- " + ingredient.getName() + " (" + ingredient.getCalories() + " ккал)");
                }
                System.out.println("Общая каолорийность блюда: " + recipe.totalCalories);
            }
        }
    }



}