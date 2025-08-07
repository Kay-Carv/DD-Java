package br.com.fiap2espa; //endereço do pacote onde se encontra a nossa class

import java.util.Scanner;

public class GameV1 {
    public static void main(String[] args) {
        //Criando interação com o usuário
        System.out.println("\n\tBem vindo ao jogo da turma 2ESPA!");

        System.out.println("Qual é o seu nome?");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.next();
        leitor.nextLine();

        System.out.println("\nOlá " + nome + " você é capaz de descobrir o número sorteado?");

        int numeroSorteado = 47;

        System.out.println("Digite um número entre 0 e 101");
        int numeroEscolhido = leitor.nextInt();
        //System.out.println("Você digitou o número " +  leitor.nextInt());

        if(numeroEscolhido == numeroSorteado) {
            System.out.println("Parabéns " + nome + ", você acertou o número!!!");
        } else {
            System.out.println("Você perdeu :(");
        }

    }
}