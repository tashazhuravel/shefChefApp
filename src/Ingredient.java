public class Ingredient extends Product {
    protected double count; // количество: штуки, стакан, ложка и т.д.
    protected double units; // вес и объем гр, кг, мл, л и т.д.
    private static final long versionId = 1L;

    public Ingredient(String name, int calories, double count, double units){
        super(name, calories);
        this.count = count;
        this.units = units;
    }

    public double getCount(){
        return count;
    }

    public double getUnits() {
        return units;
    }
}
