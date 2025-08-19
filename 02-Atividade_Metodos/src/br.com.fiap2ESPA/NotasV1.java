package br.com.fiap2ESPA;

import java.util.Scanner;

//Reescreva o código abaixo criando e utilizando as funções sugeridas, certificando-se de que o novo sistema possui,
//exatamente, o mesmo comportamento (interações, cálculos, resultados) do programa original.

public class NotasV1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== Sistema de Notas ===");

        //Cadastro do primeiro aluno
        System.out.println("Digite o nome do aluno 1:");
        String nome1 = leitor.next();
        leitor.nextLine();
        System.out.println("Digite a primeira nota de " + nome1 + ":");
        double n1a1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota de " + nome1 + ":");
        double n2a1 = leitor.nextDouble();
        System.out.println("Digite a terceira nota de " + nome1 + ":");
        double n3a1 = leitor.nextDouble();
        double media1 = (n1a1 + n2a1 + n3a1) / 3;
        if (media1 >= 6) {
            System.out.println(nome1 + " foi aprovado com média " + media1);
        } else {
            System.out.println(nome1 + " foi reprovado com média " + media1);
        }

        //Cadastro do segundo aluno
        System.out.println("Digite o nome do aluno 2:");
        String nome2 = leitor.next();
        leitor.nextLine();
        System.out.println("Digite a primeira nota de " + nome2 + ":");
        double n1a2 = leitor.nextDouble();
        System.out.println("Digite a segunda nota de " + nome2 + ":");
        double n2a2 = leitor.nextDouble();
        System.out.println("Digite a terceira nota de " + nome2 + ":");
        double n3a2 = leitor.nextDouble();
        double media2 = (n1a2 + n2a2 + n3a2) / 3;
        if (media2 >= 6) {
            System.out.println(nome2 + " foi aprovado com média " + media2);
        } else {
            System.out.println(nome2 + " foi reprovado com média " + media2);
        }

        //Cadastro do terceiro aluno
        System.out.println("Digite o nome do aluno 3:");
        String nome3 = leitor.next();
        leitor.nextLine();
        System.out.println("Digite a primeira nota de " + nome3 + ":");
        double n1a3 = leitor.nextDouble();
        System.out.println("Digite a segunda nota de " + nome3 + ":");
        double n2a3 = leitor.nextDouble();
        System.out.println("Digite a terceira nota de " + nome3 + ":");
        double n3a3 = leitor.nextDouble();
        double media3 = (n1a3 + n2a3 + n3a3) / 3;
        if (media3 >= 6) {
            System.out.println(nome3 + " foi aprovado com média " + media3);
        } else {
            System.out.println(nome3 + " foi reprovado com média " + media3);
        }

        leitor.close();
    }
}
