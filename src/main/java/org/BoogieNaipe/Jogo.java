package org.BoogieNaipe;

import org.BoogieNaipe.ASCII.TituloInicial;

import javax.swing.*;
import java.awt.*;

public class Jogo {

    JFrame janela;
    Container container;
    JPanel tituloInicialPanel, startBotaoPanel;
    JButton startBotao;
    Font fontNormal = new Font ("TimesRoman", Font.PLAIN, 20);


    public static void main(String[] args) {
        new Jogo();
    }

    public Jogo() {
        janela = new JFrame();
        janela.setSize(800, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.getContentPane().setBackground(Color.black);
        janela.setLayout(null);
        janela.setResizable(false);
        container = janela.getContentPane();

        tituloInicialPanel = new JPanel();
        tituloInicialPanel.setBounds(100, 100, 600, 150);
        tituloInicialPanel.setBackground(Color.black);

        JLabel tituloLabel = new JLabel(TituloInicial.getTexto());
        tituloLabel.setForeground(Color.white);

        startBotaoPanel = new JPanel();
        startBotaoPanel.setBounds(300,400,200,100);
        startBotaoPanel.setBackground(Color.black);

        startBotao = new JButton("INICIAR!");
        startBotao.setBackground(Color.black);
        startBotao.setForeground(Color.white);
        startBotao.setFont(fontNormal);
        ;


        tituloInicialPanel.add(tituloLabel);
        container.add(tituloInicialPanel);
        container.add(startBotaoPanel);
        startBotaoPanel.add(startBotao);






        janela.setVisible(true);

    }
}