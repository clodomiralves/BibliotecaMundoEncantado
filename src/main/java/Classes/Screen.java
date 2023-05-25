package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements ActionListener {
    public Screen(){

        setVisible(true);
        setSize(800, 500);
        setTitle("Bliblioteca Mundo Encantado");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton primeiroBotao = new JButton();
        primeiroBotao.setBounds(100, 200,250,70);
        primeiroBotao.setFont(new Font("Arial", Font.BOLD, 40));
        primeiroBotao.setForeground(new Color(0xB388DD));
        primeiroBotao.setBackground(new Color(0x000000));
        primeiroBotao.setText("Clique no botão de Lucas");

        JButton segundoBotao = new JButton();
        segundoBotao.setBounds(200, 300,300,120);
        segundoBotao.setFont(new Font("Arial", Font.BOLD, 40));
        segundoBotao.setForeground(new Color(0xB388DD));
        segundoBotao.setBackground(new Color(0x000000));
        segundoBotao.setText("Clique no botão de Lucas");

        JButton terceiroBotao = new JButton();
        terceiroBotao.setBounds(300, 400,250,70);
        terceiroBotao.setFont(new Font("Arial", Font.BOLD, 40));
        terceiroBotao.setForeground(new Color(0xB388DD));
        terceiroBotao.setBackground(new Color(0x000000));
        terceiroBotao.setText("C4lique no botão de Lucas");
        add(primeiroBotao);
        add(segundoBotao);
        add(terceiroBotao);

        primeiroBotao.addActionListener(this);
        segundoBotao.addActionListener(this::novoteste);
        terceiroBotao.addActionListener(this::teste);


    }

    private void novoteste(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null,"Botao de Silvio funcionando");
    }

    private void teste(ActionEvent actionEvent) {
         JFrame novaTela = new JFrame();
         novaTela.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(null, "Funcionando");

    }
}
