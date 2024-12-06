import java.util.ArrayList;
import java.util.List;

public class Ingredient extends Product {
    protected double count; // количество: штуки, стакан, ложка и т.д.
    protected String units; // вес и объем гр, кг, мл, л и т.д.

    public Ingredient(String name, int calories, double count, String units) {
        super(name, calories);
        this.count = count;
        this.units = units;
    }

    public double getCount() {
        return count;
    }

    public String getUnits() {
        return units;
    }

    //рассчитать калорийность ингридента на 100гр
    public double calculateCalories() {
        return (getCalories() * count / 100);
    }
}
