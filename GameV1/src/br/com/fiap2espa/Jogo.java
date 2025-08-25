//Classe de objeto

package br.com.fiap2espa;

import java.util.Scanner;

public class Jogo { //Classe de objeto

    // Propriedades ou Atributos
    // Variáveis globais
    int numeroSorteado;
    int tentativas;
    String jogador;

    //Construtores
    Jogo(int nS, int t) {
        numeroSorteado = nS;
        tentativas = t;
    }

    //Comportamentos ou Ações
    void chamarDesafiador(Scanner leitor) {
        System.out.println("\n==== Espaço para o desafiador ===\n");
        System.out.println("Desafiador defina o número sorteado: ");
        numeroSorteado = leitor.nextInt();
        System.out.println("Desafiador defina o número de tentativas: ");
        tentativas = leitor.nextInt();
        System.out.println("Desafiador, chame o desafiador");
    }

//    Jogo(int nS, int tentativa) {
//        numeroSorteado = nS;
//        tentativas = tentativa;
//    }

    void apresentarSaudação() {
        System.out.println("Bem vindo ao jogo da turma 2ESPA!");
        System.out.println("Nesse jogo, você escolherá um número entre 1 e 100!");
    }

    String coletarNome(Scanner l) {
        System.out.println("Qual é o seu nome?");
        String nome = l.next();
        l.nextLine();
        System.out.println("Olá, " + nome + "!");
        return nome;
    }

    void apresentarDesafio() {
        System.out.println("Você é capaz de descobrir o número sorteado?");
        System.out.println("Você terá " + tentativas + " tentativas");
    }

    void jogar(Scanner l, String n) {
        while (tentativas > 0) {
            System.out.println("Digite um número entre 1 e 100:");
            int numeroEscolhido = l.nextInt();

            if(numeroEscolhido == numeroSorteado) {
                System.out.println("Parabéns, " + n + ", você ganhou!");
                break;
            } else {
                System.out.println("Que pena, " + n + ", você perdeu!");
            }
            tentativas--;
        }
    }

    void finalizarJogo () {
        System.out.println("\n___Fim de jogo___\n");
    }
}
