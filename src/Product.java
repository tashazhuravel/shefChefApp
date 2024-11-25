import java.io.Serializable;

public abstract class Product implements Serializable {
    protected String name;
    protected int calories;

    public Product(String name, int calories){
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }
}
