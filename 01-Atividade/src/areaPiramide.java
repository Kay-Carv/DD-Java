import java.util.Scanner;

public class areaPiramide {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Defina a base do triângulo");
        double base = scanner.nextDouble();
        System.out.println("Defina a altura do triângulo");
        double altura = scanner.nextDouble();

//      Cálculo
        double area = (altura * base)/2;

        System.out.println("A área do triângulo é: " + area);
    }
}
