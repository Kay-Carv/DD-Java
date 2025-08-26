package br.com.fiap2espa;

import java.util.Scanner;

public class GameV2 {
    public static void main(String[] args) {
        //Configuração do jogo:
        System.out.println("Desafiador, defina o número sorteado:");
        Scanner leitor = new Scanner(System.in);
        int númeroSorteado = leitor.nextInt();
        System.out.println("Agora, defina o número de tentativas permitidas:");
        int tentativas = leitor.nextInt();

        //Execução do jogo:
        configurarJogo();
        apresentarSaudação();
        String nome = coletarNome(leitor);
        apresentarDesafio(tentativas);
        jogar(leitor, nome, tentativas, númeroSorteado);
    }//Fim do método main

    static void configurarJogo() {}

    static void apresentarSaudação() {
        System.out.println("Bem vindo ao jogo da turma 2ESPA!");
        System.out.println("Nesse jogo, você escolherá um número entre 1 e 100!");
    }

    static String coletarNome(Scanner l) {
        System.out.println("Qual é o seu nome?");
        String nome = l.next();
        l.nextLine();
        System.out.println("Olá, " + nome + "!");
        return nome;
    }

    static void apresentarDesafio(int t) {
        System.out.println("Você é capaz de descobrir o número sorteado?");
        System.out.println("Você terá " + t + " tentativas");
    }

    static void jogar(Scanner l, String n, int t, int nS) {
        while (t > 0) {
            System.out.println("Digite um número entre 1 e 100:");
            int númeroEscolhido = l.nextInt();

            if(númeroEscolhido == nS) {
                System.out.println("Parabéns, " + n + ", você ganhou!");
                break;
            } else {
                System.out.println("Que pena, " + n + ", você perdeu!");
            }
            t--;
        }
    }
}//Fim da classe