package org.BoogieNaipe;

import javax.swing.*;
import java.awt.*;

public class Jogo {

    JFrame janela;
    Container container;
    JPanel tituloPanel;
    JLabel tituloLabel;

    public static void main(String[] args) {

        new Jogo();

    }

    public Jogo(){
        janela = new JFrame();
        janela.setSize(960,720);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.getContentPane().setBackground(Color.black);
        janela.setLayout(null);
        janela.setVisible(true);
        janela.setResizable(false);
        container = janela.getContentPane();

        tituloPanel = new JPanel();
        tituloPanel.setBounds(100,100,750,150);
        tituloPanel.setBackground(Color.black);
        tituloLabel = new JLabel("Aventura!");
        tituloLabel.setForeground(Color.white);
        container.add(tituloPanel);
    }
}
