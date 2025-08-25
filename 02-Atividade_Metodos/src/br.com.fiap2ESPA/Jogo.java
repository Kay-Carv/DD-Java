package br.com.fiap2ESPA;

import java.util.Scanner;

public class Jogo {//Classe de Objeto
    //Propriedades ou Atributos:
    int númeroSorteado;
    static int tentativas; //transformando a variável em stático
    String jogador;

    //Construtores:
    Jogo() {}

    Jogo(int nS, int t) {
        númeroSorteado = nS;
        tentativas = t;
    }

    //Comportamentos:
    void chamarDesafiador(Scanner l) {
        System.out.println("Espaço para o desafiador. O jogador não deve observar!");
        System.out.println("Desafiador, defina o número sorteado:");
        númeroSorteado = l.nextInt();
        System.out.println("Desafiador, defina o número de tentativas:");
        tentativas = l.nextInt();
        System.out.println("Desafiador, chame o jogador!");
    }

    static void apresentarSaudação() {
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

    static void apresentarDesafio() {
        System.out.println("Você é capaz de descobrir o número sorteado?");
        System.out.println("Você terá " + tentativas + " tentativas");
    }

    void jogar(Scanner l) {
        while (tentativas > 0) {
            System.out.println("Digite um número entre 1 e 100:");
            int númeroEscolhido = l.nextInt();

            if(númeroEscolhido == númeroSorteado) {
                System.out.println("Parabéns, " + jogador + ", você ganhou!");
                break;
            } else {
                System.out.println("Que pena, " + jogador + ", você perdeu!");
            }
            tentativas--;
        }
    }

    static void finalizarJogo() {
        System.out.println("Fim do Jogo!");
    }
}