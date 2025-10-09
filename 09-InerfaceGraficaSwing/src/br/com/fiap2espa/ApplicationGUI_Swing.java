package br.com.fiap2espa;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ApplicationGUI_Swing {
    private JFrame frame;
    private JPanel contentPanel;

    public ApplicationGUI_Swing() {
        //Frame principal
        frame = new JFrame("Sistema de Gestão de Amigos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        //Menu lateral
        JPanel leftMenu = new JPanel();
        leftMenu.setLayout(new GridLayout(6, 1, 5, 5));
        leftMenu.setPreferredSize(new Dimension(151, 0));
        leftMenu.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel lbMenu = new JLabel("Menu:");
        JButton btnCreate = new JButton("Cadastrar Amigo");
        JButton btnRead = new JButton("Listar Amigos");
        JButton btnUpdate = new JButton("Atualizar Dados");
        JButton btnDelete = new JButton("Excluir Amigo");
        JButton btnExit = new JButton("Sair do programa");

        //add buttons in to menu
        leftMenu.add(lbMenu);
        leftMenu.add(btnCreate);
        leftMenu.add(btnRead);
        leftMenu.add(btnUpdate);
        leftMenu.add(btnDelete);
        leftMenu.add(btnExit);

        //Painel de conteúdo
        contentPanel = new JPanel(new CardLayout());
        JLabel lbInfo = new JLabel("Escolha uma opção no menu:", SwingConstants.CENTER);

        //Ações dos botões com CRUD (Create, Read, Update e Delete)
        btnCreate.addActionListener(e -> showRegisterForm());
        btnRead.addActionListener(e -> showFriendList());
        btnUpdate.addActionListener(e -> showUpdateForm());
        btnDelete.addActionListener(e -> showDeliteForm());
        btnExit.addActionListener(e -> frame.dispose());

        //Construindo frame
        frame.add(leftMenu, BorderLayout.WEST);
        frame.add(contentPanel, BorderLayout.CENTER);


        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    // Métodos dos botões


    private void showRegisterForm() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); //Criar uma borda vazia lateral para espaçamento

        JLabel lbTitle = new JLabel("Cadastrar amigo: ");

        JTextField tfName = new JTextField();
        tfName.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40)); //MAXVALUE para deixar o tamanho máximo possível
        tfName.setBorder(BorderFactory.createTitledBorder("Nome: "));

        JTextField tfSourname = new JTextField();
        tfSourname.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        tfSourname.setBorder(BorderFactory.createTitledBorder("Sobrenome: "));

        JComboBox<String> cbSexo = new JComboBox<>(new String[]{"Masculino", "Feminino", "Outros"}); //ComboBox para fazer seleção entre opções
        cbSexo.setSelectedIndex(0);
        cbSexo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        cbSexo.setBorder(BorderFactory.createTitledBorder("Gênero"));

        JTextField tfBirthday = new JTextField();
        tfBirthday.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        tfBirthday.setBorder(BorderFactory.createTitledBorder("Data de nascimento"));

        JButton btnSave = new JButton("Enviar");
        //btnSave.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnSave.addActionListener(e -> JOptionPane.showMessageDialog(null, "Enviado"));

        panel.add(lbTitle);
        panel.add(Box.createVerticalStrut(30));
        panel.add(tfName);
        panel.add(tfSourname);
        panel.add(cbSexo);
        panel.add(tfBirthday);
        panel.add(Box.createVerticalStrut(30));
        panel.add(btnSave);

        contentPanel.removeAll();
        contentPanel.add(panel, "Cadastro");
        contentPanel.revalidate();
        contentPanel.repaint();
    }


    private void showFriendList() {
        //Matriz
        String[] columns = {"Lista de Amigos: "};
        String[][] dados = {{"Kayque"}, {"Ana"}, {"Bianca"}};

        JTable table = new JTable(dados, columns);
        JScrollPane scrollPane = new JScrollPane(table);

        contentPanel.removeAll();
        contentPanel.add(table, "Lista");
        contentPanel.revalidate();
        contentPanel.repaint();
    }



    private void showUpdateForm() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10,10 ));

        JLabel lbTitle = new JLabel("Atualizar amigos");

        JTextField tfId = new JTextField();
        tfId.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        tfId.setBorder(BorderFactory.createTitledBorder("Id"));

        JButton btnSave = new JButton("Atualizar");
        btnSave.addActionListener(e -> JOptionPane.showMessageDialog(null, "Simulação de save realizada com sucesso"));

        panel.add(lbTitle);
        panel.add(Box.createVerticalStrut(30));
        panel.add(tfId);
        panel.add(Box.createVerticalStrut(30));
        panel.add(btnSave);

        contentPanel.removeAll();
        contentPanel.add(panel, "Atualização");
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    private void showDeliteForm() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10,10 ));

        JLabel lbTitle = new JLabel("Excluir Amigo");

        JTextField tfId = new JTextField();
        tfId.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        tfId.setBorder(BorderFactory.createTitledBorder("Id"));

        JButton btnSave = new JButton("Excluir");
        //btnSave.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnSave.addActionListener(e -> JOptionPane.showMessageDialog(null, "Simulação realizada com sucesso"));

        panel.add(lbTitle);
        panel.add(Box.createVerticalStrut(30));
        panel.add(tfId);
        panel.add(Box.createVerticalStrut(30));
        panel.add(btnSave);

        contentPanel.removeAll();
        contentPanel.add(panel, "Exclusão");
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ApplicationGUI_Swing::new); //Método referencial :: faz referencia a métodos que existe no program
        //ApplicationGUI_Swing app = new ApplicationGUI_Swing();
    }
}
