import java.util.Scanner;

public class onibus {
    public static void main (String[] args) {
        int onibus = 45;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas irão pro passeio?");
        int quantPessoas = scanner.nextInt();

    //Calculo
        int quantOnibus = quantPessoas / onibus;
        int pessoasEmVan = quantPessoas % onibus;

        System.out.println("Terão " + quantOnibus + " onibus e irão " + pessoasEmVan + " pessoas em vans:");
    }
}
