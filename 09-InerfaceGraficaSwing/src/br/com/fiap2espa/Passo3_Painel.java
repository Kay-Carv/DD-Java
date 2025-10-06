package br.com.fiap2espa;

import javax.swing.*;
import java.awt.*;

public class Passo3_Painel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Painel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));    // Colocar botão no eixo Y

        //Criando botão para o painel

        JButton btn1 = new JButton("Botão 1");
        btn1.setPreferredSize(new Dimension(100, 40));
        btn1.setMaximumSize(new Dimension(100, 40));

        JButton brn2 = new JButton("Botão 2");
        panel.add(btn1);
        panel.add(Box.createVerticalStrut(25));
        panel.add(brn2);

        frame.add(panel);       //Adicionar painel no frame

        frame.setVisible(true);
    }
}
