import java.util.Scanner;

public class zad13 {
    public  static void main(String[] args){
        final int pudelko = 40;
        final int servingss_per_box = 10;
        final int calories_per_serving = 300;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę zjedzonych ciasteczek");
        int ciastko = scanner.nextInt();
        double servings = (double) ciastko / pudelko * servingss_per_box;
        double calories = servings * calories_per_serving;
        System.out.println("Liczba zjedzonych kalorii" + calories);
    }
}
