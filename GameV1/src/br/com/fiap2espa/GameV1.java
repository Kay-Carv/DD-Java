package br.com.fiap2espa; //endereço do pacote onde se encontra a nossa class

import java.util.Scanner;
//JAVA a linguagem compilada e especialista em desing de software

public class GameV1 {
    public static void main(String[] args) {
        //Criando interação com o usuário
        System.out.println("\n\tBem vindo ao jogo da turma 2ESPA!");

        System.out.println("Qual é o seu nome?");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.next();
        leitor.nextLine(); //Limpa o buffer apenas para consumir o primeiro nome

        int tentativas = 3;

        System.out.println("\nOlá " + nome + " você é capaz de descobrir o número sorteado?");
        System.out.println("Você terá " + tentativas+ " tentativas");

        int numeroSorteado = 47;

        while(tentativas > 0) {
            System.out.println("Digite um número entre 0 e 101");
            int numeroEscolhido = leitor.nextInt();
            //System.out.println("Você digitou o número " +  leitor.nextInt());

            if(numeroEscolhido == numeroSorteado) {
                System.out.println("Parabéns " + nome + ", você acertou o número!!!");
                tentativas = 0;
            } else {
                System.out.println("Você perdeu :(");
            }
            tentativas --;
            //tentativas -= tentativas;
            //tentativas = tentativas - 1;
        }
        leitor.close(); //encerrando o recurso


        // 8 tipos de arquivos primitivos

        int inteiro = 1 + 2 / 3;
        //System.out.println(inteiro);
        byte bytes; //8 bits
        short curto;//32 bit
        long longo; //64 bit

        boolean boliano; //2 bit   0 ou 1 true or false

        float decimais;
        double decimalMenor;

        char caracteres;

        // Operadores relacionados < <= > >= == !=
        // Operadores lógicos || && !

    }//--> FIM DO MÉTODO MAIN
}//Fim da classe