public class Cheese extends Ingredient {
   int size = 1;

    public Cheese(String name, int calories, double count, double units){
        super(name,calories, count, units);
    }

 //   @Override
    public int getSize() {
        return size;
    }
}
