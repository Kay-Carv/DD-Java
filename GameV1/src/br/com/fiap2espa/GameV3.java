//Classe de drive

package br.com.fiap2espa;

import java.util.Scanner;

public class GameV3 {
    public static void main(String[] args) {
        //Configuração do jogo:
        Scanner leitor = new Scanner(System.in);

        //Instanciando classe especial: Random
        // Random rd = Math.random();

        int númeroSorteado = (int) (Math.random() * 100 + 1);

        Jogo jogo1 = new Jogo(númeroSorteado, 3);

        // Chamando o desafiador
        System.out.println("Desafiador, digite a sua senha");
        int senha = leitor.nextInt();
        jogo1.chamarDesafiador(leitor, senha);

        Jogo.setPassword(1234, 4321);

        //Execução do jogo:
        Jogo.apresentarSaudação();
        Jogo.apresentarDesafio();
        jogo1.setJogador(jogo1.coletarNome(leitor)); //Passando argumento para o método set, afim de buscar uma varável privada
        jogo1.jogar(leitor);
        jogo1.finalizarJogo();

        leitor.close();
    }//Fim do método main
}//Fim da classe