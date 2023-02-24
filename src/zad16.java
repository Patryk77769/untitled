import java.util.Scanner;

public class zad16 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj cene detaliczną płytki");
        double retailPrince = scanner.nextDouble();

        double profit = retailPrince * 0.4;
        System.out.println("zysk ze sprzedaży wynosi:" + profit);
    }
}
