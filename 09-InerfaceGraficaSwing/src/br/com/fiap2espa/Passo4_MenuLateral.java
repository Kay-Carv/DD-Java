package br.com.fiap2espa;

import javax.swing.*;
import java.awt.*;

public class Passo4_MenuLateral {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu lateral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JPanel lefMenu = new JPanel();
        lefMenu.setLayout(new GridLayout(5, 1, 5, 5));
        lefMenu.setPreferredSize(new Dimension(150, 0));

        lefMenu.add(new JButton("Cadastrar"));
        lefMenu.add(new JButton("Listar"));
        lefMenu.add(new JButton("Atualizar"));
        lefMenu.add(new JButton("Excluir"));
        lefMenu.add(new JButton("Sair"));

        JPanel contentPanel = new JPanel();

        contentPanel.add(new JLabel("Área do conteúdo"));
        frame.add(lefMenu, BorderLayout.WEST);
        frame.add(contentPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
