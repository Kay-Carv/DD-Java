import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        //Duas principais funções
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua opção: ");
        int opcao = input.nextInt();


        //Estrutura Switch com lambda
        switch (opcao) {
            case 1 -> {
                //Passando mais do que uma única instrução
                System.out.println("Você digitou 1");
                System.out.println("Essa é a melhor opção");
                System.out.println("Opção top 1 from brazuka");
            }
            case 2 -> System.out.println("Você digitou 2");
            case 3 -> System.out.println("Você digitou 3");
            default -> System.out.println("Nenhuma opção foi válida!");
        }


        // Estrutura math case
        switch (opcao) {
            case 1:
                System.out.println("você digitou a opção 1");
                break;
            case 2:
                System.out.println("você digitou a opção 2");
                break;
            case 3:
                System.out.println("você digitou a opção 3");
                break;
            case 4:
                System.out.println("você digitou a opção 4");
                break;
            default:
                System.out.println("opção invalida");
        }

//        if (opcao == 1) {
//
//            System.out.println("Opção 1 passei por aqui!");
//        } else if (opcao == 2) {
//            System.out.println("Você digitou a opção 2");
//            System.out.println("Opção 2 passei por aqui!");
//        } else if (opcao == 3) {
//            System.out.println("Você digitou a opção 3");
//            System.out.println("Opção 3 passei por aqui!");
//        } else if (opcao == 4) {
//            System.out.println("Você digitou a opção 4");
//            System.out.println("Opção 4 passei por aqui!");
//        } else {
//            System.out.println("Opção invalida");
//        }


//        boolean condicao1 =  0 == 0.0001 || 8 <= 9; //Operador relacional de comparação
//        boolean condicao2 = 100 < 30;
//
//        if ( condicao1 ) {
//            System.out.println("Resposta se condição 1 verdadeiro");
//        } else if (condicao2){
//            System.out.println("Resposta se condição 2 verdadeiro");
//        }
//        else {
//            System.out.println("Resposta se todas as condições forem falsas");
//        }
//
//        if( !(100>30)) {
//
//        }
//        System.out.println("\nFim do exercício!");
    }
}
