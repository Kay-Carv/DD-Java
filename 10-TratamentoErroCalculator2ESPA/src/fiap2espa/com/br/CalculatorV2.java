//Criando calculadora
package fiap2espa.com.br;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {

        //Lógica da calculadora
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        char operador = ' ';

        System.out.println("=== Bem vindo ao sistema de calculadora===");
        System.out.println("\nEssa é uma calculadora de operadores simples com números inteiros");

        String response = "SIM";


        do {

            try {

                System.out.println("Digite uma operação: ");
                System.out.println(" (+) se soma \n (-) se subtração \n (*) se multiplicação \n (/) se divisão \n (%) se resto \n (^) se potência");
                operador = scanner.next().charAt(0);    //Se eu digitar uma string, pegue o primeiro o caracteres

                System.out.println("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo valor");
                num2 = scanner.nextDouble();

                //Exceção personalizada
                if(operador == '/' && num2 == 0) {
                    throw new DivisaoPorZeroException("Erro: Não dividiras por zero 0!!!!!");
                }

                double result = 0;
                boolean operacaoValida = true;

                switch (operador) {
                    case '+' -> result = num1 + num2;
                    case '-' -> result = num1 - num2;
                    case '%' -> result = num1 % num2;
                    case '*' -> result = num1 * num2;
                    case '/' -> result = num1 / num2;
                    case '^' -> result = (int)Math.pow(num1, num2);
                    default -> {
                        System.out.println("Operador inválido");
                        operacaoValida = false;
                    }

                }
                if(operacaoValida) {        //Caso o operador for invalido ele não traz o resultado
                    System.out.printf("O resultado da operação (%.2f %s %.2f) é: %.2f%n", num1, operador, num2, result);
                }



                System.out.println("\nDeseja realizar outra operação? (Digite sim ou não)");
                response = scanner.next();

                if (!response.equalsIgnoreCase("sim") && !response.equalsIgnoreCase("nao")) {
                    throw new RespostaInvalidaExcecao("Você precisa digitar \"Sim\" ou \"Não\"");
                }


            //Realizando multi catch para tratamento de erro
            } catch ( InputMismatchException e) {
                System.out.println("Erro: Você deve digitar apenas números!");
                scanner.next(); // LIMPA O BUFFER (Essencial!)
                response = "sim"; // Garante que o loop continue;
            } catch ( DivisaoPorZeroException | RespostaInvalidaExcecao e) {
                    System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocorreu um erro genérico");
                e.printStackTrace();
            }
        } while (response.equalsIgnoreCase("sim"));


        System.out.println("===Programa finalizado===");
        scanner.close();
    }
}