import java.util.Scanner;

public class GalToLit {
    public static void main (String[] args) {
//        double gallons = 10;
        double liters = 0;

        //Input do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de gallons para serem transformados em litros");
        double gallons = scanner.nextDouble();

        //Cálculo

        liters = gallons * 3.785;

        System.out.println(gallons + " gallons equivalem a " + liters + " litros");


    }
}
