import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        //ESTRUTURAS DE CONTROLE

        // Inicialização do Scanner para entrada de dados
        Scanner input = new Scanner(System.in);

        // --- Seção de Estruturas Condicionais ---

        System.out.println("Digite sua opção: ");
        int opcao = input.nextInt();

        System.out.println("\n--- Estrutura 'if/else' ---");
        if (opcao == 1) {
            System.out.println("Opção 1 passei por aqui!");
        } else if (opcao == 2) {
            System.out.println("Você digitou a opção 2");
            System.out.println("Opção 2 passei por aqui!");
        } else if (opcao == 3) {
            System.out.println("Você digitou a opção 3");
            System.out.println("Opção 3 passei por aqui!");
        } else if (opcao == 4) {
            System.out.println("Você digitou a opção 4");
            System.out.println("Opção 4 passei por aqui!");
        } else {
            System.out.println("Opção invalida");
        }

        System.out.println("\n--- Estrutura 'if/else' com Operadores Lógicos ---");
        boolean condicao1 = 0 == 0.0001 || 8 <= 9;
        boolean condicao2 = 100 < 30;

        if (condicao1) {
            System.out.println("Resposta se a condição 1 for verdadeira");
        } else if (condicao2) {
            System.out.println("Resposta se a condição 2 for verdadeira");
        } else {
            System.out.println("Resposta se todas as condições forem falsas");
        }

        if (!(100 > 30)) {
            // Este bloco está vazio, mas pode ser preenchido
        }

        // --- Seção de Estruturas Switch ---

        System.out.println("\n--- Estrutura 'switch' tradicional ---");
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

        System.out.println("\n--- Estrutura 'switch' com Lambda (mais moderna) ---");
        switch (opcao) {
            case 1 -> {
                System.out.println("Você digitou 1");
                System.out.println("Essa é a melhor opção");
                System.out.println("Opção top 1 from brazuka");
            }
            case 2 -> System.out.println("Você digitou 2");
            case 3 -> System.out.println("Você digitou 3");
            default -> System.out.println("Nenhuma opção foi válida!");
        }

        // --- Seção de Loops (Laços de Repetição) ---

        // Loop 'while' para continuar com base na entrada do usuário
        System.out.println("\n--- Loop 'while' de Continuação ---");
        int resposta = 1;
        while (resposta == 1) {
            System.out.println("Continuando o código");
            System.out.println("Deseja continuar? (digite 1 para sim)");
            resposta = input.nextInt();
        }

        // Loop 'while' para um jogo de adivinhação
        System.out.println("\n--- Loop 'while' com Tentativas ---");
        int tentativas = 3;
        while (tentativas > 0) {
            System.out.println("Digite o seu chute:");
            int chute = input.nextInt();
            if (chute == 59) {
                System.out.println("Você ganhou! Parabéns");
                break;
            } else {
                System.out.println("Você perdeu!");
                tentativas--;
            }
        }

        // Loop 'for' para um jogo de adivinhação
        System.out.println("\n--- Loop 'for' com Tentativas ---");
        for (int t = 3; t > 0; t--) {
            System.out.println("Digite o seu chute:");
            int chute = input.nextInt();
            if (chute == 59) {
                System.out.println("Você ganhou! :D");
                break;
            } else {
                System.out.println("Você perdeu!");
            }
        }

        // Exemplo de loop 'while'
        System.out.println("\n--- Exemplo de 'while' para continuar ---");
        int continuar = input.nextInt(); // Pede nova entrada
        while (continuar == 1) {
            System.out.println("Continuando o código");
            System.out.println("Deseja continuar? (digite 1, para sim!)");
            continuar = input.nextInt();
        }

        // O loop 'for' infinito foi comentado pois não deve ser usado em produção
        /*
        for (;;) {
            System.out.println("Qualquer coisa");
        }
        */

        System.out.println("\nFim do exercício!");

        // Fechando o objeto Scanner
        input.close();
    }
}