//Classe de drive

package br.com.fiap2espa;

import java.util.Scanner;

public class GameV3 { //Classe de drive
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        Jogo jogo1 = new Jogo(59, 3); //Estanciando novo objeto na tela

        //jogo1.chamarDesafiador(leitor);

        //Execução do jogo:
        jogo1.apresentarSaudação();
        jogo1.jogador = jogo1.coletarNome(leitor);
        jogo1.apresentarDesafio();
        jogo1.jogar(leitor, jogo1.jogador);
        jogo1.finalizarJogo();

//        Jogo jogo2 = new Jogo(45, 2);
//        apresentarDesafio(jogo2.tentativas);
//        jogar(leitor, nome, jogo1.tentativas, jogo2.numeroSorteado);
//        finalizarJoog();

        leitor.close();
    }//Fim do método main


}//Fim da classe