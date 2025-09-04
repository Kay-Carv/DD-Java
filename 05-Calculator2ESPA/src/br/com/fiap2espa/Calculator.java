//Criando calculadora

package br.com.fiap2espa;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //Lógica da calculadora
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Bem vindo ao sistema de calculadora===");
        System.out.println("\nEssa é uma calculadora de operadores simples com números inteiros");

        String response;

        do {
            System.out.println("Digite uma operação: ");
            System.out.println(" (+) se soma \n (-) se subtração \n (*) se multiplicação \n (/) se divisão \n (%) se resto \n (^) se potência");
            char operador = scanner.next().charAt(0);    //Se eu digitar uma string, pegue o primeiro o caracteres

            System.out.println("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo valor");
            int num2 = scanner.nextInt();

            int result;
            switch (operador) {
                case '+' -> System.out.println(result = (num1 + num2));
                case '-' -> result = num1 - num2;
                case '%' -> result = num1 % num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
                case '^' -> result = (int) Math.pow(num1, num2);
                default -> {
                    System.out.println("Operador inválido");
                    result = 0;
                }
            }
            System.out.printf("O resultado da operação (%d%s%d) é: %d%n", num1, operador, num2, result);

            System.out.println("\nDeseja realizar outra operação? (Digite sim ou não)");
            response = scanner.next();
        } while (response.equalsIgnoreCase("sim"));

        System.out.println("===Programa finalizado===");
        scanner.close();
    }
}