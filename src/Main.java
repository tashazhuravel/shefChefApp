import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Для ввода ингридиентов с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ингредиенты (введите 'Стоп', чтобы завершить ввод):");
        while (true){
            System.out.print("Название ингредиента:");
            String name = scanner.nextLine();
            if(name.equalsIgnoreCase("Стоп")){
                break;
            }
            System.out.print("Количество:");
            double count = scanner.nextDouble();
            scanner.nextLine(); // Очистка буфера

            System.out.print("Единицы измерения (кг, г, мл, л, шт., стакан, ст.л., ч.л.):");
            String units =scanner.nextLine();
            scanner.nextLine(); // Очистка буфера

        }
    //Ввод названия блюда
    System.out.println("Введите название блюда");
    }

}