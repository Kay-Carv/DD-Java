package br.com.fiap2espa;

import java.util.Scanner;

public class Jogo {//Classe de Objeto
    //Propriedades ou Atributos:
    private int númeroSorteado;
    private static int tentativas; //transformando a variável em stático
    private String jogador;
    //Encapsulamento
    private static int password = 1234;

    //Construtores:
    Jogo() {}

    Jogo(int nS, int t) {
        númeroSorteado = nS;
        tentativas = t;
    }

    //Comportamentos:
    public void chamarDesafiador(Scanner l, int p) {
        if (p == password) {
            System.out.println("Espaço para o desafiador. O jogador não deve observar!");
            System.out.println("Desafiador, defina o número sorteado:");
            númeroSorteado = l.nextInt();
            System.out.println("Desafiador, defina o número de tentativas:");
            tentativas = l.nextInt();
            System.out.println("Desafiador, chame o jogador!");
        } else {
            System.out.println("Senha incorreta! :(");
        }
    }

    public static void apresentarSaudação() {
        System.out.println("Bem vindo ao jogo da turma 2ESPA!");
        System.out.println("Nesse jogo, você escolherá um número entre 1 e 100!");
    }

    public String coletarNome(Scanner l) {
        System.out.println("Qual é o seu nome?");
        String nome = l.next();
        l.nextLine();
        System.out.println("Olá, " + nome + "!");
        return nome;
    }

    public static void apresentarDesafio() {
        System.out.println("Você é capaz de descobrir o número sorteado?");
        System.out.println("Você terá " + tentativas + " tentativas");
    }

    public void jogar(Scanner l) {
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

    public static void finalizarJogo() {
        System.out.println("Fim do Jogo!");
    }

    //Método getter
    public String getJogador () {
        return jogador;
    }

    //Método setter
    public void setJogador (String n) {
        jogador = n;
    }

    public static int getTentativas() {
        return tentativas;
    }

    public void setTentativas (int t) {
        tentativas = t;
    }

    //Método de instância para nova senha
    public static void setPassword(int p, int nP) {
        if ( p == password) {
            password = nP;
        } else {
            System.out.println("Senha Incorreta!");
        }
    }
}