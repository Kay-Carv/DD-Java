package br.com.fiap2ESPA;

// import java.util.Random; //importando a biblioteca random para Number Aleatório
import java.util.Scanner;

//Classe Driver
public class GameV3 {
    public static void main(String[] args) {
        //Configuração do jogo:
        Scanner leitor = new Scanner(System.in);

        //Instanciando classe especial: Random

        // Random rd = Math.random();

        int númeroSorteado = (int) (Math.random() * 100 + 1);
        System.out.println(númeroSorteado);
        Jogo jogo1 = new Jogo(númeroSorteado, 3);

        //Execução do jogo:


        Jogo.apresentarSaudação();
        Jogo.apresentarDesafio();
        jogo1.jogador = jogo1.coletarNome(leitor);
        jogo1.jogar(leitor);
        jogo1.finalizarJogo();

        leitor.close();
    }//Fim do método main
}//Fim da classe