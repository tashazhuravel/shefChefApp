import java.util.ArrayList;
import java.util.List;

public class Ingredient extends Product {
    protected double count; // количество: штуки, стакан, ложка и т.д.
    protected String units; // вес и объем гр, кг, мл, л и т.д.
    private static final List<Ingredient> ingredients = new ArrayList<>(); //Общий список ингредиентов

    public Ingredient(String name, int calories, double count, String units){
        super(name, calories);
        this.count = count;
        this.units = units;
        ingredients.add(this); // Добавление объектов в общий список ингредиентов
    }

    public double getCount(){
        return count;
    }

    public String getUnits() {
        return units;
    }

    //Метод для получения общего списка игредиентов
    public static List<Ingredient> getIngredients(){
        return ingredients;
    }

    //рассчитать калорийность ингридента на 100гр
    public double calculateCalories(){
        return (getCalories() * count / 100);
    }
}
