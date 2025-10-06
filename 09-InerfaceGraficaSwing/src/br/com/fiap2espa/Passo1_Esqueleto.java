//Criando interface gráfica para interações com o usuário usando swing

package br.com.fiap2espa;

import javax.swing.*;

public class Passo1_Esqueleto {
    public static void main(String[] args) {
//        String resposta = JOptionPane.showInputDialog("Digite alguma coisa: ");        --> Coloca na tela uma interface de input
//        System.out.println(resposta);

        //Criando frame
        JFrame frame= new JFrame("Estrutura inicial");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Output --> Encerrar o programa assim que fechar pelo X
        frame.setLocationRelativeTo(null);
        frame.setSize(720,480);
        frame.setVisible(true);

    }
}
