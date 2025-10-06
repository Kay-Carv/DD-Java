package br.com.fiap2espa;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Passo2Botao {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Passo par criar um botão");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);

        JButton button = new JButton("Clique aqui");
        button.addActionListener((ActionEvent_e) -> {
            JOptionPane.showMessageDialog(frame,"Você clicou no botão!");
        });
        frame.add(button);

        frame.setVisible(true);
    }
}
