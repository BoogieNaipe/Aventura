package org.BoogieNaipe;

import javax.swing.*;
import java.awt.*;

public class Jogo {

    JFrame janela;

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
    }
}
